package model;

public abstract class ContenidoAudiovisual {
    private String titulo;
    private int anio;

    public ContenidoAudiovisual(String titulo, int anio) {
        this.titulo = titulo;
        this.anio = anio;
    }

    public String getTitulo() { return titulo; }
    public int getAnio() { return anio; }

    public abstract void mostrarInfo();
}
