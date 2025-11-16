package data;

import model.CentroCultivo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GestorDatos {

    public ArrayList<CentroCultivo> cargarCentros() {
        ArrayList<CentroCultivo> lista = new ArrayList<>();

        try {
            FileReader fr = new FileReader("resources/centros.txt");
            System.out.println("Archivo abierto");
            BufferedReader br = new BufferedReader(fr);

            String linea;

            while ((linea = br.readLine()) != null) {
                String[] corte = linea.split(";");
                int toneladas = Integer.parseInt(corte[2]);

                CentroCultivo centro = new CentroCultivo(corte[0], corte[1], toneladas);
                lista.add(centro);
            }

            br.close(); // cerrar archivo
        }
        catch (IOException err) {
            System.out.println(err.getMessage());
        }

        return lista; // Devolver lista completa
    }



}