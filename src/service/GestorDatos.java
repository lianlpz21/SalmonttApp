package service;

import model.CentroCultivo;
import util.Validador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GestorDatos {

    public ArrayList<CentroCultivo> cargarCentros() {

        ArrayList<CentroCultivo> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("resources/centros.txt"))) {

            String linea;
            while ((linea = br.readLine()) != null) {

                if (linea.trim().isEmpty()) {
                    System.out.println("Línea vacía detectada, saltando...");
                    continue;
                }

                String[] corte = linea.split(";");

                if (!Validador.validarLinea(corte)) {
                    System.out.println("Formato incorrecto: " + linea);
                    continue;
                }

                if (!Validador.esEntero(corte[2])) {
                    System.out.println("Error: Producción no numérica → " + linea);
                    continue;
                }

                try {
                    CentroCultivo centro = new CentroCultivo(
                            corte[0],          // nombre
                            corte[1],          // comuna
                            Integer.parseInt(corte[2])  // producción
                    );

                    lista.add(centro);

                } catch (Exception e) {
                    System.out.println("Error creando objeto desde línea: " + linea);
                }
            }

        } catch (IOException e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }

        return lista;
    }
}
