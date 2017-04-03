package hu.helix.homework03;

import java.util.Random;

/**
 * Created by Dániel on 2017. 04. 01..
 */

/*Sajnos a szájbarágós segitséged után is csak ennyire voltam képes */

public class PasswordGenerator {

    public static String generatePassword() {

        int length = 10;
        Random rng = new Random();
        int [] jelszohossz=new int[65];
        String jelszo="a";
        String possibleCharacters = (new String("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!?%"));


        for (int i = 0; i <= length; i++) {


            int s = rng.nextInt(65);
            jelszohossz[i]=s;
            System.out.println(s);
        }



        return jelszo;
    }
}


    /*  String jelszo=new String();*/
     /*  int length=10;
    Random rng=new Random();
    String jelszo=new String();
     char kisbetu = (char)(rng.nextInt(26) + 'a');
     char nagybetu = (char)(rng.nextInt(26) + 'A');
     int szamok =  (rng.nextInt(9)+0);
     String jelek = "?%!";



    jelszo= String.valueOf(kisbetu)+String.valueOf(nagybetu)+String.valueOf(szamok)+jelek;

*/
















