package model;

public class SerieDeTV extends ContenidoAudiovisual {
    private Temporada temporada;

    public SerieDeTV(String titulo, int anio, Temporada temporada) {
        super(titulo, anio);
        this.temporada = temporada;
    }

    public Temporada getTemporada() { return temporada; }

    @Override
    public void mostrarInfo() {
        System.out.println("Serie: " + getTitulo() + " (" + getAnio() + ") - " + temporada.toString());
    }

    @Override
    public String toString() {
        return getTitulo() + "," + getAnio() + ",TEMP," + temporada.getNumero() + "," + temporada.getCantidadEpisodios();
    }
}
