package aplicacion;

import dominio.*;

class Principal {

    public static void main(String[] args) {
        testMain();
    }

    public static void testMain() {
        Municipio BoadillaDelMonte = new Municipio("Boadilla del Monte");
        Municipio PozueloDeAlarcon = new Municipio("Pozuelo de Alarcon");

        Localidad LasLomas = new Localidad();
        Localidad Valdecabanas = new Localidad();

        Localidad Humera = new Localidad();
        Localidad CiudadDeLaImagen = new Localidad();

        LasLomas.setNombre("Las Lomas");
        Valdecabanas.setNombre("Valdecabanas");
        Humera.setNombre("Humera");
        CiudadDeLaImagen.setNombre("Ciudad De La Imagen");


        LasLomas.setNumeroDeHabitantes(30500);
        Valdecabanas.setNumeroDeHabitantes(29500);
        Humera.setNumeroDeHabitantes(50000);
        CiudadDeLaImagen.setNumeroDeHabitantes(60000);

        BoadillaDelMonte.addLocalidades(LasLomas, Valdecabanas);
        PozueloDeAlarcon.addLocalidades(Humera, CiudadDeLaImagen);
        System.out.println(BoadillaDelMonte.toString());
        System.out.println(PozueloDeAlarcon.toString());

        Provincia Madrid = new Provincia("Madrid");
        Madrid.addMunicipios(BoadillaDelMonte, PozueloDeAlarcon);

        System.out.println(Madrid.toString());
    }
}