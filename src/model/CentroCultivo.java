package model;

public class CentroCultivo extends UnidadOperativa {

    private int produccionKg;

    public CentroCultivo(String nombre, String comuna, int produccionKg) {
        super(nombre, comuna);
        if (produccionKg < 0) {
            throw new IllegalArgumentException("La producción no puede ser negativa");
        }
        this.produccionKg = produccionKg;
    }

    @Override
    public String mostrarResumen() {
        return "Centro de Cultivo\n" +
                "Nombre: " + getNombre() + "\n" +
                "Comuna: " + getComuna() + "\n" +
                "Producción: " + produccionKg + " KG";
    }
}
