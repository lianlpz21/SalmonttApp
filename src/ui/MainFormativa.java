package ui;

import data.GestorUnidades;
import model.UnidadOperativa;

public class MainFormativa {

    public static void main(String[] args) {

        GestorUnidades gestor = new GestorUnidades();
        UnidadOperativa[] unidades = gestor.crearUnidadesDemo();

        System.out.println("=== Unidades Operativas de Salmontt ===");

        for (UnidadOperativa u : unidades) {
            System.out.println(u);
        }
    }
}
