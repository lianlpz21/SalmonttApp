package data;

import model.*;

import javax.swing.*;
import java.util.ArrayList;

public class GestorEntidades {

    private ArrayList<Registrable> entidades = new ArrayList<>();

    public void agregarEntidad(Registrable r) {
        entidades.add(r);
    }

    public void mostrarEntidades() {

        if (entidades.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No existen registros.");
            return;
        }

        StringBuilder sb = new StringBuilder("REGISTROS SALMONTT\n\n");

        for (Registrable r : entidades) {

            sb.append(r.mostrarResumen());

            if (r instanceof CentroCultivo) {
                sb.append("\nTipo: Centro de Cultivo");
            } else if (r instanceof PlantaProceso) {
                sb.append("\nTipo: Planta de Proceso");
            } else if (r instanceof Empleado) {
                sb.append("\nTipo: Empleado");
            } else if (r instanceof Proveedor) {
                sb.append("\nTipo: Proveedor");
            }

            sb.append("\n\n----------------------\n\n");
        }

        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
