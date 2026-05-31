package mvc;

import model.ContenidoAudiovisual;

public class Controlador {
    private VistaConsola vista;

    public Controlador(VistaConsola vista) {
        this.vista = vista;
    }

    public void mostrarContenido(ContenidoAudiovisual c) {
        vista.mostrarMensaje("Título: " + c.getTitulo() + " | Año: " + c.getAnio());
        c.mostrarInfo();
        vista.mostrarLinea();
    }
}
