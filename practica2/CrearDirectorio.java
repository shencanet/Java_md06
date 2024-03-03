package practica2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class CrearDirectorio {

    public static void main(String[] args) {
        // Nombre del archivo

        File miDirectorio = new File("miDirectorio");
        //File miDirectorio = new File(Paths.get("src", "miDirectorio").toString());
        //File miDirectorio = new File("src" + File.separator + "miDirectorio");
        File miFichero = new File("miDirectorio/mifichero.txt");
       

        try {

            if (miDirectorio.exists()) {
                System.out.println("El directorio ya existe. No se hará nada.");
            } else {
                // Intentar crear el directorio
                if (miDirectorio.mkdir()) {
                    System.out.println("Directorio creado exitosamente.");
                } else {
                    System.out.println("Error al crear el directorio.");
                }
            }


            if (miFichero.createNewFile()) {
                System.out.println("archivo creados exitosamente.");
            } else {
                System.out.println("Error al crear el archivo ya existe.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Fin del Programa.");
    }
}
