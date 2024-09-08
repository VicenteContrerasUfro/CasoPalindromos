package org.example;

public class Palindromo {
    public static boolean esPalindromo(String cadena) {
        String resultado = new StringBuilder(cadena).reverse().toString();
        return cadena.equals(resultado);
    }
}

