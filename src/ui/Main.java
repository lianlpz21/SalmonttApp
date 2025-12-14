package ui;

import data.GestorEntidades;
import model.*;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        GestorEntidades gestor = new GestorEntidades();
        int opcion;

        do {
            opcion = pedirEntero(
                    "SISTEMA SALMONTT\n\n" +
                            "1. Agregar Empleado\n" +
                            "2. Agregar Proveedor\n" +
                            "3. Agregar Centro de Cultivo\n" +
                            "4. Mostrar registros\n" +
                            "0. Salir"
            );

            if (opcion == -1) {
                JOptionPane.showMessageDialog(null, "Cerrando sistema...");
                System.exit(0);
            }

            switch (opcion) {

                case 1 -> {
                    String nombre = JOptionPane.showInputDialog("Nombre del empleado:");
                    if (nombre == null) break;

                    String cargo = JOptionPane.showInputDialog("Cargo:");
                    if (cargo == null) break;

                    gestor.agregarEntidad(new Empleado(nombre, cargo));
                }

                case 2 -> {
                    String nombre = JOptionPane.showInputDialog("Nombre del proveedor:");
                    if (nombre == null) break;

                    String rubro = JOptionPane.showInputDialog("Rubro:");
                    if (rubro == null) break;

                    gestor.agregarEntidad(new Proveedor(nombre, rubro));
                }

                case 3 -> {
                    String nombre = JOptionPane.showInputDialog("Nombre del centro:");
                    if (nombre == null) break;

                    String comuna = JOptionPane.showInputDialog("Comuna:");
                    if (comuna == null) break;

                    int prod = pedirEntero("Producción en KG:");
                    if (prod >= 0) {
                        gestor.agregarEntidad(new CentroCultivo(nombre, comuna, prod));
                    }
                }

                case 4 -> gestor.mostrarEntidades();
            }

        } while (opcion != 0);

        JOptionPane.showMessageDialog(null, "Programa finalizado");
    }

    private static int pedirEntero(String mensaje) {
        while (true) {
            String input = JOptionPane.showInputDialog(mensaje);

            if (input == null) return -1;

            if (input.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "El campo no puede estar vacío");
                continue;
            }

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número válido");
            }
        }
    }
}
