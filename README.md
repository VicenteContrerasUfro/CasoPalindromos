# Proyecto: Verificación de Palíndromos

Este proyecto contiene la implementación de un método en Java para verificar si una cadena de texto es un palíndromo, así como pruebas unitarias para validar su correcto funcionamiento.

## Descripción de los Métodos

### esPalindromo(String cadena)
- **Descripción:** Este método determina si una cadena de texto es un palíndromo. Un palíndromo es una palabra, frase, número u otra secuencia de caracteres que se lee igual de adelante hacia atrás.
- **Cómo funciona el código:**
    1. El método verifica si la cadena es `null` o está vacía. Si es así, devuelve `true` ya que una cadena vacía se considera un palíndromo.
    2. La cadena se procesa eliminando los espacios y convirtiéndola a minúsculas para normalizar la comparación.
    3. La cadena procesada se invierte y se compara con la original procesada.
    4. Devuelve `true` si ambas cadenas son iguales, indicando que es un palíndromo; de lo contrario, devuelve `false`.
- **Ejemplos de las pruebas unitarias:**
    - Entrada: `"oro"` → Salida: `true`
    - Entrada: `"La tele letal"` → Salida: `true`
    - Entrada: `"desierto"` → Salida: `false`

## Pruebas Unitarias

### PalindromoTest.java
- **Descripción:** Este archivo contiene las pruebas unitarias para validar diferentes casos de uso del método `esPalindromo`.
- **Casos probados:**
    - `"oro"`: Debe devolver `true`.
    - `"desierto"`: Debe devolver `false`.
    - `"rallar"`: Debe devolver `true`.
    - `"reconocer"`: Debe devolver `true`.
    - `"La tele letal"`: Debe devolver `true`.
    - `"hola"`: Debe devolver `false`.

## Desarrollo de la Actividad

### Paso 1: Leer y entender el contexto problema
1.1 Se revisó la funcionalidad del método `esPalindromo` inicialmente en JavaScript para comprender su objetivo: determinar si una cadena es un palíndromo.

### Paso 2: Entender el método JavaScript y replicarlo en Java
2.1 Se discutió con el grupo y se hizo la funcionalidad del método de JavaScript en Java, asegurando que la implementación funcionara sin errores.

### Paso 3: Diseño de un plan de pruebas
3.1 Se diseñó una prueba unitaria, con varios casos algunos Verdaderos y otros Falsos.

3.2 Los casos implementados incluyeron tanto palíndromos simples como frases y palabras no palíndromas.

### Paso 4: Mejoras y pruebas adicionales
4.1 Se consideraron casos adicionales como números enteros, cadenas vacías y frases complejas.
Caso de prueba 1, el output deberia ser falso ya que no es palíndromo
Caso de prueba 2, el output deberia ser falso ya que la cadena es null
Caso de prueba 3, el ouput deberia ser True ya que es palíndromo
Caso de prueba 4, el output deberia ser False ya que no es palíndromo
Caso de prueba 5, el output deberia ser True, a pesar de la mayúscula.

4.2 
¿Qué consideraciones tomaron en cuenta?
R: Casos como los números enteros, las cadenas nulas o las mayúsculas

¿Qué mejoró en su método?
R: La diferencia entre distintos casos mas exclusivos como los del paso 4.1

¿Qué rol jugaron las pruebas en mejorar su código?
R: Ayudaron a mejorar el código para determinar casos mas especiales como se comentaba anteriormente, permitiendo no solo ver casos de palabras, si no de números o carácteres "raros".

---

Este README resume el trabajo realizado y los pasos desarrollados para implementar y probar el método de verificación de palíndromos en Java.
