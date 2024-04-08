public class MethodPalindrome {
    public static boolean isPalindrome(String word) {
        String cleanWord = word.replaceAll("\\s", "");
        String reverse = new StringBuilder(cleanWord).reverse().toString();
        return cleanWord.equals(reverse);
    }
}
