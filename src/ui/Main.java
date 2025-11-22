package ui;

import data.GestorDatos;
import model.CentroCultivo;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        GestorDatos gd = new GestorDatos();
        ArrayList<CentroCultivo> centros = gd.cargarCentros();

        System.out.println("=== LISTA COMPLETA DE CENTROS ===");
        for (CentroCultivo cc : centros) {
            System.out.println(cc);
        }

        System.out.println("=== CENTROS CON PRODUCCIÓN > 1000 ===");
        for (CentroCultivo cc : centros) {
            if (cc.getProduccionToneladas() > 1000) {
                System.out.println(cc);
            }
        }
    }
}
