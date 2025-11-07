public class Palabra {
    private String palabra;

    public Palabra(String palabra) {
        this.palabra = palabra;
    }

    public boolean validarPalindromo() {
        palabra=palabra.toLowerCase();
        palabra = palabra.replaceAll("\\s", "");
        String reverso = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            if (!Character.isLetter(palabra.charAt(i))) {
                throw new IllegalArgumentException("La palabra contiene caracteres no válidos.");
            }
        }
        reverso = new StringBuilder(palabra).reverse().toString();

        if (!palabra.equals(reverso)) {
            throw new IllegalArgumentException("La palabra no es un palíndromo.");
        }
        return palabra.equals(reverso);
    }
}
