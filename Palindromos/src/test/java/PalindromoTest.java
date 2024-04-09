import org.example.Palindromo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromoTest {
    public static Palindromo pal;

    @BeforeEach
    void setUp() {
        pal = new Palindromo();

    }

    @AfterEach
    void tearDown() {
        pal = null;

    }

    @Test
    void validacionPalindromosTest1() {
        Assertions.assertEquals(true, pal.validacionPalindromos("hola aloh"));


    }
    @Test
    void validacionPalindromosTest2(){
        Assertions.assertEquals(true, pal.validacionPalindromos("l"));
    }
}