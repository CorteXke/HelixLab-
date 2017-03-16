package hu.helix;

public class Main {

    public static void main(String[] args) {
        // téglalap kerülete
        int a=6;
        int b=8;
        int sum=2*(a+b);
        int sum2=a*b;
        System.out.print("a téglalap kerülete:");
        System.out.println(sum);

        //téglalap területe
       System.out.print("a téglalap területe:");
        System.out.println(sum2);
   //második feladat, dl átváltása
        // a dl határoztam meg konstansként és azt szoroztam illetve osztottam

        int deci=26;
        double liter=deci*0.1;
        double milliliter=deci*100;
        double centiliter=deci*10;
        double hektoliter=deci*0.001;
         System.out.println("26 dl =" +liter + " liter");
         System.out.println("26 dl=" +milliliter +" ml");
         System.out.println("26dl="+hektoliter + " hl");
         System.out.println("\n");


    }

}

