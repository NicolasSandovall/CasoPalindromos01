import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EnhancedMethodPalindromeTest {

    @Test
    public void testCleanWord() {
        assertEquals("hola", EnhancedMethodPalindrome.cleanWord("¡Hólà"));
        assertEquals("", EnhancedMethodPalindrome.cleanWord("!@#$%"));
        assertEquals("nicolas", EnhancedMethodPalindrome.cleanWord("Nicol #### ás"));
        assertEquals("", EnhancedMethodPalindrome.cleanWord(""));
    }

    @Test
    public void testReverseWord() {
        assertEquals("223344", EnhancedMethodPalindrome.reverseWord("443322"));
        assertEquals("seisa", EnhancedMethodPalindrome.reverseWord("asies"));
        assertEquals("87654321", EnhancedMethodPalindrome.reverseWord("12345678"));
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(EnhancedMethodPalindrome.isPalindrome("reconocer"));
        assertFalse(EnhancedMethodPalindrome.isPalindrome("java"));
        assertTrue(EnhancedMethodPalindrome.isPalindrome("Anita lava la tina"));
        assertFalse(EnhancedMethodPalindrome.isPalindrome("esto no es un palindromo"));
        assertTrue(EnhancedMethodPalindrome.isPalindrome("¡Aa  aa a5a  #3$%% !"));
        assertFalse(EnhancedMethodPalindrome.isPalindrome(""));
        assertFalse(EnhancedMethodPalindrome.isPalindrome("3234324a"));
        assertFalse(EnhancedMethodPalindrome.isPalindrome("ab"));
    }


}