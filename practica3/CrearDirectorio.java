import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CrearDirectorio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Crear el directorio y el archivo");
            System.out.println("2. Eliminar el archivo");
            System.out.println("3. Eliminar el directorio");
            System.out.println("4. Escribir en el archivo");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Scanner scannerCrearArchivo = new Scanner(System.in);
                    verificarRutaAD(scannerCrearArchivo);
                    break;
                case 2:
                    eliminarArchivo();
                    break;
                case 3:
                    eliminarDirectorio();
                    break;
                case 5:
                    System.out.println("Fin del programa.");
                    scanner.close();
                    
                    System.exit(0);
            
                    break;
                case 4:
                    escribirEnArchivo(scanner);
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    } 

    private static void verificarRutaAD(Scanner scanner) {
        File directorio = new File("C:/AD");
        if (directorio.exists()) {
            System.out.println("El directorio AD ya existe. No se hará nada.");
            verificarRutaEjercicios();
        } else {
            if (directorio.mkdir()) {
                System.out.println("Directorio AD creado exitosamente.");
                verificarRutaEjercicios();
            } else {
                System.out.println("Error al crear el directorio AD.");
            }
        }
    }

    private static void verificarRutaEjercicios() {
        File directorio = new File("C:/AD/Ejercicios");
        if (directorio.exists()) {
            System.out.println("El directorio Ejercicios ya existe. No se hará nada.");
            crearDirectorioYArchivo();
        } else {
            if (directorio.mkdir()) {
                System.out.println("Directorio Ejercicios creado exitosamente.");
                crearDirectorioYArchivo();
            } else {
                System.out.println("Error al crear el directorio Ejercicios.");
            }
        }
    }

    private static void crearDirectorioYArchivo() {
        File nuevoDirectorio = new File("C:/AD/Ejercicios/nuevoDirectorio");
        File miFichero = new File("C:\\AD\\Ejercicios\\nuevoDirectorio\\miFichero.txt");

        try {
            if (nuevoDirectorio.exists()) {
                System.out.println("El directorio ya existe. No se hará nada.");
            } else {
                if (nuevoDirectorio.mkdir()) {
                    System.out.println("Directorio creado exitosamente.");
                } else {
                    System.out.println("Error al crear el directorio.");
                }
            }

            if (miFichero.createNewFile()) {
                System.out.println("Archivo creado exitosamente.");
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void escribirEnArchivo(Scanner scanner) {
        File miFichero = new File("C:\\AD\\Ejercicios\\nuevoDirectorio\\miFichero.txt");
    
        System.out.println("Escriba el contenido que desea añadir al archivo (escriba 'fin' para finalizar):");
    
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(miFichero, true))) {
            while (true) {
                String linea = scanner.nextLine();
                if (linea.equalsIgnoreCase("fin")) {
                    break;
                }
                writer.write(linea);
                writer.newLine();
            }
            System.out.println("Contenido añadido al archivo.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    

    private static void eliminarArchivo() {
        File miFichero = new File("C:\\AD\\Ejercicios\\nuevoDirectorio\\miFichero.txt");

        if (miFichero.exists()) {
            if (miFichero.delete()) {
                System.out.println("Archivo eliminado exitosamente.");
            } else {
                System.out.println("Error al eliminar el archivo.");
            }
        } else {
            System.out.println("El archivo no existe.");
        }
    }

    private static void eliminarDirectorio() {
        File nuevoDirectorio = new File("C:/AD/Ejercicios/nuevoDirectorio");

        if (nuevoDirectorio.exists()) {
            if (nuevoDirectorio.delete()) {
                System.out.println("Directorio eliminado exitosamente.");
            } else {
                System.out.println("Error al eliminar el directorio.");
            }
        } else {
            System.out.println("El directorio no existe.");
        }
    }
}
