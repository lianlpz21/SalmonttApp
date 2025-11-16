package ui;


import data.GestorDatos;
import model.CentroCultivo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

      GestorDatos gd = new GestorDatos();
      ArrayList<CentroCultivo> centros = gd.cargarCentros();

        System.out.println("---LISTA COMPLETA ---");
      for (CentroCultivo cc : centros) {
          System.out.println(cc);
      }

        System.out.println("--- FILTRO POR TONELADAS");
      for (CentroCultivo cc : centros) {
          if(cc.getProduccionToneladas() > 1000) {
              System.out.println(cc);
          }
      }
    }
}