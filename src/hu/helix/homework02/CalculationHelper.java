package hu.helix.homework02;

import java.util.Scanner;

/**
 * Created by Dániel on 2017. 03. 25..
 */
public class CalculationHelper {

    public static void helper(){


        Scanner scan1 = new Scanner(System.in);

        System.out.println("adjon meg egy számot:");
        int num1=scan1.nextInt();
        System.out.println("adjon meg még egy számot:");
        int num2=scan1.nextInt();
        System.out.println("adjon meg egy müveletet:");
        char operation=scan1.next().charAt(0);

        CalculationService.calculate(num1,num2,operation);


    }
}




