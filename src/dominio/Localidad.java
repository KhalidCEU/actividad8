package dominio;

public class Localidad {
    private String nombre;
    private int numeroDeHabitantes;

    public void setNombre(String nombre) {
        this.nombre = nombre ;
    }

    public void setNumeroDeHabitantes(int numeroDeHabitantes) {
        this.numeroDeHabitantes = numeroDeHabitantes;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getNumeroDeHabitantes() {
        return this.numeroDeHabitantes;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + ". " + "Número de habitantes: " + this.numeroDeHabitantes;
    }
}
