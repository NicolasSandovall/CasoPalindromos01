package org.example;



import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void hacerCadaLetraMinuscula() {
        assertEquals("abcdefghijklmnñopqrstuvxyz", Main.hacerCadaLetraMinuscula("ABCDEFGHIJKLMNÑOPQRSTUVXYZ"));
    }

    @org.junit.jupiter.api.Test
    void hacerCadenaIdonea() {
        assertEquals("hola", Main.hacerCadenaIdonea("H##$o[¨[¨**L   ,.,-´{´0897895a"));
        assertEquals("", Main.hacerCadenaIdonea("   3552352532$%#%#,.,---:;:$"));
    }

    @org.junit.jupiter.api.Test
    public void testEsPalindromo() {
        assertEquals(false, Main.esPalindromo("200"));
        assertEquals(true, Main.esPalindromo("aaabccbaaa"));
        assertEquals(false, Main.esPalindromo("ahabccbaaa"));
        assertEquals(false, Main.esPalindromo("La tele letal"));
        assertEquals(true, Main.esPalindromo(""));
    }

}