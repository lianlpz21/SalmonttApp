package model;

public class CentroCultivo {

    private String nombre;
    private String comuna;
    private int produccionKg;

    public CentroCultivo(String nombre, String comuna, int produccionKg) {
        setNombre(nombre);
        setComuna(comuna);
        setProduccionKg(produccionKg);
    }

    public String getNombre() { return nombre; }
    public String getComuna() { return comuna; }
    public int getProduccionKg() { return produccionKg; }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public void setComuna(String comuna) {
        if (comuna == null || comuna.trim().isEmpty()) {
            throw new IllegalArgumentException("La comuna no puede estar vacía.");
        }
        this.comuna = comuna;
    }

    public void setProduccionKg(int produccionKg) {
        if (produccionKg < 0) {
            throw new IllegalArgumentException("La producción no puede ser negativa.");
        }
        this.produccionKg = produccionKg;
    }

    @Override
    public String toString() {
        return "\n--- Centro de Cultivo ---" +
                "\nNombre: " + nombre +
                "\nComuna: " + comuna +
                "\nProducción: " + produccionKg + " KG\n";
    }
}
