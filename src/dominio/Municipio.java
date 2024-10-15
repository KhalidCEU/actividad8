package dominio;
import java.util.ArrayList;


public class Municipio {
    private ArrayList<Localidad> municipio;
    private String nombre;
    private int numeroDeHabitantes;

    public Municipio(String nombre) {
        this.municipio = new ArrayList<>();
        this.numeroDeHabitantes = 0;
        this.nombre = nombre;
    }

    public int getNbHabitantesMunicipio() {
        this.numeroDeHabitantes = 0;
        for (Localidad l : municipio ) {
            this.numeroDeHabitantes += l.getNumeroDeHabitantes();
        }
        return this.numeroDeHabitantes;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void addLocalidades(Localidad... localidades) {
        for (Localidad localidad : localidades) {
            municipio.add(localidad);
        }
    }

    @Override
    public String toString() {
        return "El municipio " + this.nombre + " tiene " + this.getNbHabitantesMunicipio() + " habitantes.";
    }
}
