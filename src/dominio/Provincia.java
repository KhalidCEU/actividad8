package dominio;

import java.util.ArrayList;
import java.io.Serializable;

public class Provincia implements Serializable {

    private ArrayList<Municipio> provincia;
    private String nombre;
    private int numeroDeHabitantes;

    public Provincia(String nombre) {
       this.provincia = new ArrayList<>();
       this.numeroDeHabitantes = 0;
       this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public ArrayList<Municipio> getMunicipios() {
        return provincia;
    }

    public int getNbHabitantesProvincia() {
        for (Municipio m : provincia) {
            this.numeroDeHabitantes += m.getNbHabitantesMunicipio();
        }
        return this.numeroDeHabitantes;
    }

    public void addMunicipios(Municipio... municipios) {
        for (Municipio m : municipios) {
            provincia.add(m);
            System.out.println("Municipio " + m.getNombre() + " añadido a la provincia " + this.nombre);
        }
    }

    @Override
    public String toString() {
        return "La provincia " + this.nombre + " tiene " + this.getNbHabitantesProvincia() + " habitantes.";
    }
}
