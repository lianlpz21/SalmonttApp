package model;

public class CentroCultivo {

    private String nombre;
    private String comuna;
    private int produccionKg;

    public CentroCultivo(String nombre, String comuna, int produccionKg) {
        this.nombre = nombre;
        this.comuna = comuna;
        this.produccionKg = produccionKg;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getComuna() { return comuna; }
    public void setComuna(String comuna) { this.comuna = comuna; }

    public int getProduccionToneladas() { return produccionKg; }
    public void setProduccionToneladas(int produccionKg) {
        this.produccionKg = produccionKg;
    }

    @Override
    public String toString() {
        return "\nCentro de Cultivo" +
                "\nNombre: " + nombre +
                "\nComuna: " + comuna +
                "\nProducción: " + produccionKg + " KG\n";
    }
}
