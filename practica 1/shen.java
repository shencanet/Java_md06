import java.io.FileWriter;
import java.io.IOException;

public class shen {
    public static void main(String[] args) {

        // Nombre del archivo
        String nombreArchivo = "archivo.txt";

        // Contenido del archivo
        String contenido = "shen";

        try {
            // Crear un objeto FileWriter
            FileWriter writer = new FileWriter(nombreArchivo);

            // Escribir el contenido en el archivo
            writer.write(contenido);

            // Cerrar el FileWriter
            writer.close();

            System.out.println("Archivo creado exitosamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al crear el archivo.");
            e.printStackTrace();
        }

    }
}
