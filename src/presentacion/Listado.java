package presentacion;

import java.util.ArrayList;

import dominio.*;

public class Listado {
        private Gestionario gestionario;
        private int indiceMunicipios = 1;
        ArrayList<Provincia> provincias;

        public Listado(Gestionario gestionario) {
            this.gestionario = gestionario;
            this.provincias = gestionario.getProvincias();
        }

        public void listarProvincias() {
            if (provincias.isEmpty()) {
                System.out.println("No hay provincias disponibles");
                return;
            }

            System.out.println("Provincias:");
            for (Provincia provincia : provincias) {
                System.out.println(provincias.indexOf(provincia) + 1 + ". " + provincia.getNombre());
            }
        }

        public void listarMunicipios() {
            for (Provincia provincia : provincias) {
                System.out.println("Municipios de " + provincia.getNombre() + ":");
                ArrayList<Municipio> municipios = provincia.getMunicipios();
                if (municipios.isEmpty()) {
                    System.out.println("  No hay municipios disponibles para " + provincia.getNombre());
                } else {
                    for (Municipio municipio : municipios) {
                        System.out.print("  - ");
                        System.out.println(indiceMunicipios++ + ". " + municipio.getNombre());
                    }
                }
            }
            indiceMunicipios = 1;
        }

        public void listarLocalidades() {
            System.out.println("Localidades: ");
            for (Provincia provincia : provincias) {
                ArrayList<Municipio> municipios = provincia.getMunicipios();
                if (municipios.isEmpty()) {
                    System.out.println("  No hay municipios disponibles para " + provincia.getNombre());
                } else {
                    for (Municipio municipio : municipios) {
                        ArrayList<Localidad> localidades = municipio.getLocalidades();
                        for (Localidad localidad : localidades) {
                            System.out.println("  - " + localidad.getNombre()  + " (" + municipio.getNombre() + ", " + provincia.getNombre() + "). "
                            + "Numero de habitantes: " + localidad.getNumeroDeHabitantes() + ".");
                        }
                    }
                }
                System.out.println(provincia);
            }
        }

}
