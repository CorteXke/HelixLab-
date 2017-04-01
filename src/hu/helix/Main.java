package hu.helix;

import hu.helix.homework02.CalculationHelper;
import hu.helix.homework02.CalculationService;

public class Main {

     public static void main(String[] args) {



        /*
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
        System.out.println("\n");
   //második feladat, dl átváltása
        // a dl határoztam meg konstansként és azt szoroztam illetve osztottam
*/
        //2. feladat dl átváltás
        int deci=26;
        double hektoliter = (double) Math.round((deci * 0.001) * 1000000) / 1000000;
        double liter= (double) Math.round((deci*0.1)* 1000000) / 1000000;
        double mililiter= (double) Math.round((deci*100)*100000/100000);
        double centiliter= (double) Math.round((deci*10)*100000/100000);
        System.out.println("26dl= " +hektoliter + " hl") ;
        System.out.println("26dl= " + liter + " l");
        System.out.println("26dl= " +mililiter + " ml") ;
        System.out.println("26dl= " +centiliter + " cl") ;

/*
         // 3. feladat, gömb térfogat számitás

        double PI=Math.PI;
        double r=12;
        System.out.println("a"+r + "sugarú gömb térfogata= "+4 * r^3 * PI /3);
        System.out.println("\n");

        //4. feladat Fahrenheit Celsius váltás

        int cels = (55- 32) * 5 / 9;
        int fah= 9 * (41/ 5) + 32;

        System.out.println("55 Fahrenheit = "+cels +" celsius");
        System.out.println("41 celsius=" +fah +" fahrenheit");
        System.out.println("\n");


        /*5. feladat Írasd ki a következő kimenetet egyetlen System.out.println(); metódus hívás segítségével.

        Tipp: escape sequences

        Output

                ************
* Hello 	*
* World	*
* in    		*
* a     	*
* frame 	*
************
* */
        /*
        System.out.println(" ********* \n * Hello * \n * World * \n * in    * \n * a     * \n * frame * \n ********* \n");



         //6. faladat ASCII kód kiiratása

        char character= 'ä';
        int ascii= (int) character;
        System.out.println("a ä karakter ASCII kódja: "+ascii);








*/
    }

}