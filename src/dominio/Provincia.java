package dominio;

import java.util.ArrayList;

public class Provincia {
    private ArrayList<Municipio> provincia;
    private String nombre;
    private int numeroDeHabitantes;

    public Provincia(String nombre) {
       this.provincia = new ArrayList<>();
       this.numeroDeHabitantes = 0;
       this.nombre = nombre;
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
            System.out.println("Added municipio " + m.getNombre() + " to provincia " + this.nombre);
        }
    }

    @Override
    public String toString() {
        return "La provincia " + this.nombre + " tiene " + this.getNbHabitantesProvincia() + " habitantes.";
    }
}
