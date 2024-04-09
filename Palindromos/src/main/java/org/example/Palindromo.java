package org.example;

public class Palindromo {
    public static boolean validacionPalindromos (String cadena1){
        for (int i = 0, j = cadena1.length() - 1; i < j; i++, j--){
            if (cadena1.charAt(i) != cadena1.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
