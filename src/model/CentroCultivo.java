package model;

public class CentroCultivo extends UnidadOperativa {


    private int produccionKg;

    public CentroCultivo(String nombre, String comuna, int produccionKg) {
        super(nombre, comuna);
        setProduccionKg(produccionKg);
    }

    public int getProduccionKg() { return produccionKg; }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        super.setNombre(nombre);
    }

    public void setComuna(String comuna) {
        if (comuna == null || comuna.trim().isEmpty()) {
            throw new IllegalArgumentException("La comuna no puede estar vacía.");
        }
        super.setcomuna(comuna);
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
                "\nNombre: " + getNombre() +
                "\nComuna: " + getComuna() +
                "\nProducción: " + produccionKg + " KG\n";
    }
}
