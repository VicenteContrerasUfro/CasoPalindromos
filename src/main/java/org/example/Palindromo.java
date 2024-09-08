package org.example;

public class Palindromo {
    public static boolean esPalindromo(String cadena) {
        if (cadena == null || cadena.isEmpty()) {
            return true;
        }
        String procesada = cadena.replaceAll("\\s", "").toLowerCase();
        String invertida = new StringBuilder(procesada).reverse().toString();
        return procesada.equals(invertida);
    }
}


