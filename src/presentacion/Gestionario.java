package presentacion;

import dominio.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Gestionario {
        private ArrayList<Provincia> provincias = new ArrayList<>();
        private Listado listado;

        public Gestionario() { }

        public Listado getListado() {
            if (listado == null) {
                listado = new Listado(this);
            }
            return listado;
        }

        public ArrayList<Provincia> getProvincias() {
            return provincias;
        }

        public void addProvincia(String provinciaName) {
            Provincia provincia = new Provincia(provinciaName);
            provincias.add(provincia);
            System.out.println("Provincia añadida: " + provinciaName);
        }

        public void addMunicipio(String municipioName, int indiceProvincia) {
            Municipio municipio = new Municipio(municipioName);
            provincias.get(indiceProvincia).addMunicipios(municipio);
        }

        public void addLocalidad(String localidadName, int nbHabitantes, int indiceMunicipio) {
            Municipio municipio = getMunicipioPorIndice(indiceMunicipio);
            Localidad localidad = new Localidad(localidadName);
            localidad.setNumeroDeHabitantes(nbHabitantes);
            municipio.addLocalidad(localidad);
        }

        public void listarDatos() {
            listado.listarProvincias();
            System.out.print("\n");
            listado.listarMunicipios();
            System.out.print("\n");
            listado.listarLocalidades();
        }

        public int getIndice(Scanner sc) {
            System.out.print("> Seleccione el número : ");
            int indice;

            try {
                indice = Integer.parseInt(sc.nextLine()) - 1;
                if (indice < 0 || indice >= provincias.size()) {
                    System.out.println("Índice invalido. Inténtalo de nuevo.");
                    return 1;
                }
            } catch (NumberFormatException e) {
                System.out.println("Input invalido, por favor inserte un número.");
                return 1;
            }
            return indice;
        }

        public Municipio getMunicipioPorIndice(int indiceUnico) {
            int indiceReal = 0;

            for (Provincia provincia : provincias) {
                ArrayList<Municipio> municipios = provincia.getMunicipios();

                for (Municipio municipio : municipios) {
                    if (indiceReal == indiceUnico) {
                        return municipio;
                    }
                    indiceReal++;
                }
            }
            return null;
        }


}
