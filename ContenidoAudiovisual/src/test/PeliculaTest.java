package test;

import static org.junit.Assert.*;
import org.junit.Test;
import model.*;

public class PeliculaTest {

    @Test
    public void testCrearPeliculaYActor() {
        Actor actor = new Actor("Leonardo DiCaprio", 48);
        Pelicula peli = new Pelicula("Inception", 2010, actor);

        assertEquals("Inception", peli.getTitulo());
        assertEquals(2010, peli.getAnio());
        assertNotNull(peli.getActorPrincipal());
        assertEquals("Leonardo DiCaprio", peli.getActorPrincipal().getNombre());
        assertEquals(48, peli.getActorPrincipal().getEdad());
    }
}
