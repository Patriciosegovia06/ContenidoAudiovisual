package app;

import model.Actor;
import model.Pelicula;
import model.Temporada;
import model.SerieDeTV;
import model.Investigador;
import model.Documental;
import mvc.VistaConsola;
import mvc.Controlador;
import repositorio.RepositorioContenido;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear objetos de ejemplo (deben declararse antes de usarlos)
        Actor actor = new Actor("Leonardo DiCaprio", 48);
        Pelicula peli = new Pelicula("Inception", 2010, actor);

        Temporada temp = new Temporada(1, 10);
        SerieDeTV serie = new SerieDeTV("Breaking Bad", 2008, temp);

        Investigador inv = new Investigador("Jane Goodall", "Biología");
        Documental doc = new Documental("Chimpancés", 2015, inv);

        // MVC
        VistaConsola vista = new VistaConsola();
        Controlador controlador = new Controlador(vista);

        // Mostrar contenidos
        controlador.mostrarContenido(peli);
        controlador.mostrarContenido(serie);
        controlador.mostrarContenido(doc);

        // Guardar y cargar ejemplo de películas
        List<Pelicula> listaPeliculas = new ArrayList<>();
        listaPeliculas.add(peli);
        String ruta = "peliculas.csv";
        RepositorioContenido.guardarPeliculasCSV(ruta, listaPeliculas);
        vista.mostrarMensaje("Películas guardadas en " + ruta);

        List<Pelicula> cargadas = RepositorioContenido.cargarPeliculasDesdeCSV(ruta);
        vista.mostrarMensaje("Películas cargadas desde CSV: " + cargadas.size());
        for (Pelicula p : cargadas) {
            controlador.mostrarContenido(p);
        }
    }
}
