package model;

public class Proveedor implements Registrable {

    private String nombre;
    private String rubro;

    public Proveedor(String nombre, String rubro) {
        this.nombre = nombre;
        this.rubro = rubro;
    }

    @Override
    public String mostrarResumen() {
        return "Proveedor\n" +
                "Nombre: " + nombre + "\n" +
                "Rubro: " + rubro;
    }
}
