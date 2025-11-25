package app;

import model.CentroCultivo;
import service.GestorDatos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GestorDatos gd = new GestorDatos();
        ArrayList<CentroCultivo> centros = gd.cargarCentros();

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n======== SISTEMA SALMONTT ========");
            System.out.println("1. Mostrar todos los centros");
            System.out.println("2. Mostrar centros con producción > 1000 kg");
            System.out.println("3. Buscar por comuna");
            System.out.println("4. Salir");
            System.out.print("Seleccione opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println("===== LISTA COMPLETA DE CENTROS =====");
                    centros.forEach(System.out::println);
                    break;

                case 2:
                    System.out.println("===== CENTROS CON PRODUCCIÓN > 1000 KG =====");
                    centros.stream()
                            .filter(c -> c.getProduccionKg() > 1000)
                            .forEach(System.out::println);
                    break;

                case 3:
                    System.out.print("Ingrese comuna a buscar: ");
                    String comunaBuscada = sc.nextLine();

                    System.out.println("===== RESULTADOS =====");
                    centros.stream()
                            .filter(c -> c.getComuna().equalsIgnoreCase(comunaBuscada))
                            .forEach(System.out::println);
                    break;

                case 4:
                    System.out.println("Cerrando sistema...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcion != 4);
    }
}
