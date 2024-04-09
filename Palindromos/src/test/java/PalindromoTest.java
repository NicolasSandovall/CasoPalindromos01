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
        Assertions.assertEquals(true, pal.validacionPalindromos("Level"));


    }
    @Test
    void validacionPalindromosCantCaracteres(){
        Assertions.assertEquals(false, pal.validacionPalindromos("l"));
    }

    @Test
    void validacionPalindromosVacio(){
        Assertions.assertEquals(false, pal.validacionPalindromos("  "));
    }

    @Test
    void validacionPalindromosEspaciosDistintos(){
        Assertions.assertEquals(true, pal.validacionPalindromos("Now, sir, a war is won"));
    }

    @Test
    void validacionPalindromosCaracteresDist(){
        Assertions.assertEquals(false, pal.validacionPalindromos("120"));
    }
}