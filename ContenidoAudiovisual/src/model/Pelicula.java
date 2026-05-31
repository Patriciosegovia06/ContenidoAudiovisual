package model;

public class Pelicula extends ContenidoAudiovisual {
    private Actor actorPrincipal;

    public Pelicula(String titulo, int anio, Actor actorPrincipal) {
        super(titulo, anio);
        this.actorPrincipal = actorPrincipal;
    }

    public Actor getActorPrincipal() { return actorPrincipal; }

    @Override
    public void mostrarInfo() {
        System.out.println("Película: " + getTitulo() + " (" + getAnio() + ") - Actor: " + actorPrincipal.getNombre());
    }

    @Override
    public String toString() {
        return getTitulo() + "," + getAnio() + "," + actorPrincipal.getNombre() + "," + actorPrincipal.getEdad();
    }
}
