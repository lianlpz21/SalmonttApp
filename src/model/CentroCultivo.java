package model;

public class CentroCultivo {

    private String nombre;
    private String comuna;
    private int produccionToneladas;

    public CentroCultivo(String nombre, String comuna, int produccionToneladas) {
        this.nombre = nombre;
        this.comuna = comuna;
        this.produccionToneladas = produccionToneladas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna() {
        this.comuna = comuna;
    }

    public int getProduccionToneladas() {
        return produccionToneladas;
    }

    public void setProduccionToneladas(int produccionToneladas) {
        this.produccionToneladas = produccionToneladas;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + System.lineSeparator() +
                "Comuna: " + comuna + System.lineSeparator() +
                "Produccion: " + produccionToneladas + " Toneladas";
    }
}
