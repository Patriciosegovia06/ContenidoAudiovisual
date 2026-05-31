package repositorio;

import model.*;
import java.util.*;

public class RepositorioContenido {

    // Cargar películas desde CSV con formato:
    // PELICULA,titulo,anio,actorNombre,actorEdad
    public static List<Pelicula> cargarPeliculasDesdeCSV(String ruta) {
        List<Pelicula> peliculas = new ArrayList<>();
        List<String> lineas = ArchivoManager.leerCSV(ruta);
        for (String linea : lineas) {
            String[] partes = linea.split(",");
            if (partes.length >= 5 && partes[0].equalsIgnoreCase("PELICULA")) {
                try {
                    String titulo = partes[1].trim();
                    int anio = Integer.parseInt(partes[2].trim());
                    String actorNombre = partes[3].trim();
                    int actorEdad = Integer.parseInt(partes[4].trim());
                    Actor actor = new Actor(actorNombre, actorEdad);
                    peliculas.add(new Pelicula(titulo, anio, actor));
                } catch (NumberFormatException ex) {
                    System.out.println("Formato numérico inválido en línea: " + linea);
                }
            }
        }
        return peliculas;
    }

    public static void guardarPeliculasCSV(String ruta, List<Pelicula> peliculas) {
        List<String> lineas = new ArrayList<>();
        for (Pelicula p : peliculas) {
            lineas.add("PELICULA," + p.toString());
        }
        ArchivoManager.escribirCSV(ruta, lineas);
    }

    // Puedes añadir métodos análogos para series y documentales.
}
