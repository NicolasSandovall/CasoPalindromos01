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
    void validacionPalindromosMayusculas() {
        Assertions.assertEquals(true, pal.validaString("Level"));


    }
    @Test
    void validacionPalindromosLargo(){
        Assertions.assertEquals(false, pal.validaString("a"));
    }

    @Test
    void validacionPalindromosVacio(){
        Assertions.assertEquals(false, pal.validaString("  "));
    }

    @Test
    void validacionPalindromosEspaciosDistintos(){
        Assertions.assertEquals(true, pal.validaString("La tele letal"));
    }

    @Test
    void validacionPalindromosCaracteresDist(){
        Assertions.assertEquals(false, pal.validaString(10));
    }
    @Test
    void validacionPalindromoCaracteresString(){
        Assertions.assertEquals(true, pal.validaString("Now, sir, a war is won!"));
    }



}