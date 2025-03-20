package FICHEROS;

import java.io.File;
import utilidades.Entrada;

public class ListarContenidoDeCarpeta {
    public static void main(String[] args) {
        // 1. Pedimos al usuario que introduzca una ruta
        System.out.print("Introduzca una ruta: ");
        String ruta = Entrada.cadena(); // Usamos la clase Entrada para leer la cadena introducida por el usuario
        File f = new File(ruta); // Creamos un objeto File con la ruta introducida
        
        // 2. Comprobamos si la ruta existe
        if (!f.exists()) {
            // Si la ruta no existe, mostramos un mensaje de error
            System.out.println("No existe la ruta: " + f.getAbsolutePath());
            return; // Terminamos el programa si la ruta no existe
        }
        
        // 3. Si la ruta existe, mostramos la ruta completa
        System.out.println("La ruta: " + f.getAbsolutePath());

        // 4. Comprobamos si la ruta es un directorio
        if (f.isDirectory()) {
            System.out.println("Es un directorio.");
            
            // 5. Listamos el contenido del directorio usando list()
            String[] archivos = f.list();
            if (archivos != null && archivos.length > 0) {
                System.out.println("Contenido del directorio:");
                // Recorremos cada archivo o subdirectorio dentro del directorio
                for (String archivo : archivos) {
                    File archivoActual = new File(f, archivo); // Creamos un objeto File para cada archivo/subdirectorio
                    if (archivoActual.isDirectory()) {
                        // Si es un directorio, lo indicamos con [D]
                        System.out.println("  [D] " + archivo); // Directorio
                    } else {
                        // Si es un archivo, mostramos el nombre y el tamaño
                        System.out.println("  [F] " + archivo + " (" + archivoActual.length() + " bytes)"); // Archivo
                    }
                }
            } else {
                // Si el directorio está vacío, lo indicamos
                System.out.println("El directorio está vacío.");
            }
        }
        
        // 6. Comprobamos si la ruta es un archivo
        if (f.isFile()) {
            System.out.println("Es un fichero.");
            // Mostramos el tamaño del archivo
            System.out.println("Su tamaño es: " + f.length() + " bytes");
        }
    }
}