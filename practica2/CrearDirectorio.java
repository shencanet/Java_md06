package practica2;

import java.io.File;
import java.io.IOException;

public class CrearDirectorio {

    public static void main(String[] args) {
        // Nombre del archivo

        File miDirectorio = new File("src/miDirectorio");
        File miFichero = new File("src/miDirectorio/mifichero.txt");

        try {
            miDirectorio.mkdir();
            if (miFichero.createNewFile()) {
                System.out.println("Directorio y archivo creados exitosamente.");
            } else {
                System.out.println("Error al crear el archivo.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Fin del PROGRAMA");
    }
}
