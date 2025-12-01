package data;

import model.CentroCultivo;
import model.PlantaProceso;
import model.UnidadOperativa;

public class GestorUnidades {

    public UnidadOperativa[] crearUnidadesDemo() {

        // Objetos de prueba de CentroCultivo
        CentroCultivo c1 = new CentroCultivo("Centro Aguas Claras", "Calbuco", 1500);
        CentroCultivo c2 = new CentroCultivo("Centro Los Pingüinos", "Quellón", 2000);

        // Objetos de prueba de PlantaProceso
        PlantaProceso p1 = new PlantaProceso("Planta Sur", "Puerto Montt", 8000);
        PlantaProceso p2 = new PlantaProceso("Planta Norte", "Ancud", 12000);

        // Retornar todo como arreglo
        return new UnidadOperativa[] { c1, c2, p1, p2 };
    }
}
