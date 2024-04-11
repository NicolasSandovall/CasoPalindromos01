package org.example;

import java.util.Scanner;
import java.util.*;

public class Main {


    public static String hacerCadaLetraMinuscula(String cadena) {
        return cadena.toLowerCase();
    }

    public static String hacerCadenaIdonea(String cadena){
        String resultado = cadena.replaceAll("[^a-zA-Z]", "");

        resultado = hacerCadaLetraMinuscula(resultado);

        return resultado;

    }

    public static Boolean esPalindromo(String cadena){

        List<String> resultado = Arrays.asList(cadena.split(""));

        Collections.reverse(resultado);

        String strResultado = "".join("",resultado);

        if (strResultado.contains(cadena)){
            return true;
        }else{
            return false;
        }
        sds
    }
    public static void imprimir (Boolean bool){
        if (bool == true){
            System.out.println("Es palindromo");
        }else{
            System.out.println("No es palindromo");
        }
    }
    public static String Ingresarcadena(){
        Scanner teclado = new Scanner(System.in);
        String cadena = teclado.nextLine();
        return cadena;
    }


    public static void main(String[] args){
        imprimir(esPalindromo(hacerCadenaIdonea(Ingresarcadena())));
    }

}


