package model;

public class Documental extends ContenidoAudiovisual {
    private Investigador investigador;

    public Documental(String titulo, int anio, Investigador investigador) {
        super(titulo, anio);
        this.investigador = investigador;
    }

    public Investigador getInvestigador() { return investigador; }

    @Override
    public void mostrarInfo() {
        System.out.println("Documental: " + getTitulo() + " (" + getAnio() + ") - Investigador: " + investigador.getNombre());
    }

    @Override
    public String toString() {
        return getTitulo() + "," + getAnio() + ",DOC," + investigador.getNombre() + "," + investigador.getEspecialidad();
    }
}
