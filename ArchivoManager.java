package repositorio;

import java.io.*;
import java.util.*;

public class ArchivoManager {

    public static List<String> leerCSV(String ruta) {
        List<String> lineas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (!linea.trim().isEmpty()) lineas.add(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + ruta);
        } catch (IOException e) {
            System.out.println("Error leyendo archivo: " + e.getMessage());
        }
        return lineas;
    }

    public static void escribirCSV(String ruta, List<String> lineas) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            for (String l : lineas) {
                bw.write(l);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error escribiendo archivo: " + e.getMessage());
        }
    }
}
