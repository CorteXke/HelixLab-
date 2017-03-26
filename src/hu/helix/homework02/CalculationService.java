package hu.helix.homework02;


/**
 * Created by Dániel on 2017. 03. 25..
 */
public class CalculationService {
        public boolean isItEven(int number) {
            if (number%2==0)
            return true;
            else
                return false;
        }


        public static void calculate(int x , int y, char operation){

            int result=0;
            switch(operation){
                case '+':
                     result=x+y;
                    break;
                case '/':
                     result=x/y;
                    break;
                case '*':
                    result=x*y;
                    break;
                case '-':
                    result=x-y;
                    break;


            }
        System.out.println("eredmény: " +result);




        }
}

