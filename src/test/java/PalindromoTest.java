import static org.junit.jupiter.api.Assertions.*;
import org.example.Palindromo;
import org.junit.jupiter.api.Test;

public class PalindromoTest {
    @Test
    public void PalindromoTest() {
        assertTrue(Palindromo.esPalindromo("aca"));
        assertFalse(Palindromo.esPalindromo("acas"));
        assertTrue(Palindromo.esPalindromo("h"));
        assertFalse(Palindromo.esPalindromo("ahabccbaaa"));
        assertTrue(Palindromo.esPalindromo("La tele letal"));
        assertTrue(Palindromo.esPalindromo(""));
    }
}


