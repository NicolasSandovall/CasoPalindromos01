import java.text.Normalizer;
import java.util.Scanner;

public class EnhancedMethodPalindrome {
    // Método para limpiar la palabra de caracteres especiales y convertirla a minúsculas
    public static String cleanWord(String word) {
        String cleanWord = word.replaceAll("[^\\p{L}]", "").toLowerCase();
        return Normalizer.normalize(cleanWord, Normalizer.Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    }

    // Método para invertir una palabra
    public static String reverseWord(String word) {
        return new StringBuilder(word).reverse().toString();
    }

    // Método para verificar si una palabra es un palíndromo
    public static boolean isPalindrome(String word) {
        String cleanWord = cleanWord(word);
        if (cleanWord.length() < 3) // Si la palabra limpia tiene menos de tres letras, no es un palíndromo
            return false;
        String reversed = reverseWord(cleanWord);
        return cleanWord.equals(reversed);
    }

    // Método para obtener la entrada del usuario
    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (input.isEmpty() || input.replaceAll("[^a-zA-Z]", "").length() < 3) {
            System.out.println("Por favor, ingresa una palabra o frase de al menos 3 letras para verificar si es un palíndromo:");
            input = scanner.nextLine().trim(); // Eliminar espacios en blanco al inicio y al final
            if (input.isEmpty() || input.replaceAll("[^a-zA-Z]", "").length() < 3) {
                System.out.println("La entrada debe tener al menos 3 letras.");
            }
        }
        scanner.close();
        return input;
    }

    // Método para procesar la entrada del usuario
    public static void processInput(String input) {
        if (isPalindrome(input)) {
            System.out.println(cleanWord(input) + " es un palíndromo.");
        } else {
            System.out.println(cleanWord(input) + " no es un palíndromo.");
        }
    }

    // Método principal, punto de entrada del programa
    public static void main(String[] args) {
        String input = getInput();
        processInput(input);
    }
}