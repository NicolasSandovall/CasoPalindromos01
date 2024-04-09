package org.example;

public class Palindromo {

    //valida que el dato ingresado sea un string
    public static boolean validaString (Object cadena){
        if (cadena instanceof String){
            return validarVacio((String) cadena);
        }else{
            return false;
        }}
    //Valida que el string no venga vacio
    public static boolean validarVacio(String cadena){
        if (!(cadena.trim().isEmpty())){
            return largoMinimo(cadena);
        }else{
            return false;
        }
    }
    //Devuelve verdadero si el caracter que se esta evaluando es una letra
    // (isAlphabetic:evalua por el numero que se le asigna a cadacaracter) o devuelve verdadero si
    // hay un numero dentro de un string (isdigit).
    private static boolean filtroLetras(char caracter) {
        return Character.isAlphabetic(caracter) || Character.isDigit(caracter);
    }

    //largo minimo para ser un palindromo
    public static Boolean largoMinimo(String cadena){
        if(cadena.length() >= 2){
            return validacionPalindromos(cadena);
        }else {
            return false;
        }

    }
    //Si es un caracter sigue avanzando y lo ignora pero sino los compara y si son iguales sigue avanzando, sino enseguida falso
    public static boolean validacionPalindromos (String cadena){
        for (int i = 0, j = cadena.length() - 1; i < j; i++, j--) {
            // omitir caracteres
            while (j >= 0 && !filtroLetras(cadena.charAt(j))) j--;
            while (i < cadena.length() && !filtroLetras(cadena.charAt(i))) i++;

            if (i >= j) return true;

            if (Character.toLowerCase(cadena.charAt(i)) != Character.toLowerCase(cadena.charAt(j)))
                return false;
        }
        return true;



    }}

