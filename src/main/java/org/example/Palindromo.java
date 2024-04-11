package org.example;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Palindromo {

    //borra todo lo que no es letra o numero

    public static String borrarCaracteresInvalidos(String cadena){
        cadena = cadena.replaceAll("[^a-zA-Z0-9]", "");
        return cadena;
    }
    //Si la cadena no es nula aplica borrar caracteres invalidos y aplicar metodo siguiente
    public static boolean stringValido(String cadena){
        if (cadena != null){
            cadena = borrarCaracteresInvalidos(cadena);
            return validacionPatronCadena(cadena);
        }else{
            return false;
        }
    }
    //Recorre la cadena por posicion y si son el mismo caracter
    public static boolean validacionPalindromos (String cadena){
        for (int i = 0, j = cadena.length() - 1; i < j; i++, j--) {
            if (cadena.charAt(i) != cadena.charAt(j)) {
                return false;
            }
        }
        return true;


    }
    //valida que el string este en minuscula, que el minimo de largo sea 3 y aplica siguiente metodo
    public static boolean validacionPatronCadena (String cadena){
        cadena = cadena.toLowerCase();
        String patronCadena = "^[a-z]{3,}$";
        Pattern pattern = Pattern.compile(patronCadena);
        Matcher matcher = pattern.matcher(cadena);
        if(matcher.matches() == true){
            return validacionPalindromos(cadena);
        }else {
            return false;
        }



    }
}

