package org.example;

public class Palindromo {
    Object cadena ;
    public static boolean introduceUnString (Object cadena){
        if (cadena instanceof String){
            return validacionPalindromos((String) cadena);
        }else{
            return false;
        }}
    public static boolean validacionPalindromos (String cadena){
        for (int i = 0, j = cadena.length() - 1; i < j; i++, j--){
            if (cadena.charAt(i) != cadena.charAt(j)){
                return false;
            }
        }
        return true;
    }
    public static void imprimirResultados (boolean resultado){
        System.out.println(resultado);
    }

    public static void main(String[] args) {
        imprimirResultados((introduceUnString("level")));

    }}

