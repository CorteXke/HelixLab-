package hu.helix.homework03;

import java.util.Random;

public class PasswordGenerator {
    
    public static String generatePassword(int length) {

        Random rng = new Random();
        String result="";
        String possibleCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!?%";

        for (int i = 0; i < length; i++) {
            int s = rng.nextInt(possibleCharacters.length());
            result += possibleCharacters.charAt(s);
        }
        return result;
    }
}