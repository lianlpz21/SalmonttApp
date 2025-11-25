package util;

public class Validador {

    public static boolean validarLinea(String[] corte) {
        return corte.length == 3;
    }

    public static boolean esEntero(String valor) {
        try {
            Integer.parseInt(valor);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
