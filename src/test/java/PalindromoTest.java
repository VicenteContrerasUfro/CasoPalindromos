import static org.junit.jupiter.api.Assertions.*;

import org.example.Palindromo;
import org.junit.jupiter.api.Test;

public class PalindromoTest {
    @Test
    public void testPalindromo() {
        assertTrue(Palindromo.esPalindromo("aca"));
        assertFalse(Palindromo.esPalindromo("acas"));
        assertTrue(Palindromo.esPalindromo("h"));
    }
}



