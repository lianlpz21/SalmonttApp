package model;

public class Empleado implements Registrable {

    private String nombre;
    private String cargo;

    public Empleado(String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
    }

    @Override
    public String mostrarResumen() {
        return "Empleado\n" +
                "Nombre: " + nombre + "\n" +
                "Cargo: " + cargo;
    }
}
