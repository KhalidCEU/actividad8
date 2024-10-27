package CLI;
import java.io.*;
import java.util.Scanner;
import dominio.*;
import presentacion.*;
import java.util.ArrayList;

public class CLI {
    private Scanner sc = new Scanner(System.in);
    private boolean running = true;
    private Gestionario gestionario;
    private ArrayList<Provincia> provincias;


    public CLI() {
        gestionario = new Gestionario();
        provincias = gestionario.getProvincias();
        loadProvincias();
    }

    public void lanzar() {
        while (running) {
            System.out.print("> ");
            String[] input = leerComandos();
            running = ejecutarComandos(input);
        }
        guardarDatos();
    }

    public String[] leerComandos() {
        String input = sc.nextLine();
        return input.split(" ");
    }

    public boolean ejecutarComandos(String[] input) {
        String comandos = String.join(" ", input).toLowerCase();

        if (comandos.equals("exit")) {
            System.out.println("Hasta la próxima !");
            sc.close();
            return false;
        }

        if (comandos.equals("add provincia")) {
            System.out.print("> Inserte el nombre de la provincia: ");
            String provinciaName = sc.nextLine();
            gestionario.addProvincia(provinciaName);
        } else if (comandos.equals("add municipio")) {
            verificarVacio(provincias);
            gestionario.getListado().listarProvincias();
            int indiceProvincia = gestionario.getIndice(sc);
            System.out.print("> Inserte el nombre del municipio: ");
            String municipioName = sc.nextLine();
            gestionario.addMunicipio(municipioName, indiceProvincia);
        } else if (comandos.equals("add localidad")) {
            gestionario.getListado().listarMunicipios();
            int indiceMunicipio = gestionario.getIndice(sc);
            System.out.print("> Inserte el nombre de la localidad: ");
            String localidadName = sc.nextLine();
            System.out.print("> Inserte el número de habitantes: ");
            int nbHabitantes = Integer.parseInt(sc.nextLine());
            gestionario.addLocalidad(localidadName, nbHabitantes, indiceMunicipio);
        } else if (comandos.equals("list")) {
            gestionario.listarDatos();
        } else {
            System.out.print("Este comando no existe: " + comandos);
            System.out.println();
        }
        return true;
    }


    private void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("datos.csv"))) {
            oos.writeObject(provincias);
            // oos.writeObject(municipios);
            System.out.println("Datos guardados correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar los datos: " + e.getMessage());
        }
    }

    private void loadProvincias() {
        File file = new File("datos.csv");
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                provincias = (ArrayList<Provincia>) ois.readObject();
                System.out.println("Provincias cargadas correctamente.");
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error al cargar las provincias: " + e.getMessage());
            }
        }
    }

    private void verificarVacio(ArrayList<Provincia> array) {
        if (array.isEmpty()) {
            System.out.print("No hay provincias disponibles. Primero añada una provincia ");
            System.out.println("con el comando: \"add provincia\"");
        }
    }

}
