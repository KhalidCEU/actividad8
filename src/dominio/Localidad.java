package dominio;
import java.io.Serializable;

public class Localidad implements Serializable {

    private String nombre;
    private int numeroDeHabitantes;

    public Localidad(String nombre) {
        this.numeroDeHabitantes = 0;
        this.nombre = nombre;
    }

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
