package model;

public class PlantaProceso extends UnidadOperativa {

    private int capacidadProceso;

    public PlantaProceso(String nombre, String comuna, int capacidadProceso) {
        super(nombre, comuna);
        this.capacidadProceso = capacidadProceso;
    }

    @Override
    public String mostrarResumen() {
        return "Planta de Proceso\n" +
                "Nombre: " + getNombre() + "\n" +
                "Comuna: " + getComuna() + "\n" +
                "Capacidad: " + capacidadProceso + " KG";
    }
}
