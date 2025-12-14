package cl.salmontt.colecciones.ui;

import cl.salmontt.colecciones.data.GestorEntidades;
import cl.salmontt.colecciones.model.Registrable;

import java.util.List;

/**
 * Punto de entrada de la aplicación.
 * Se encarga de inicializar los datos y lanzar la interfaz gráfica.
 */
public class Main {

    public static void main(String[] args) {

        // Carga inicial de entidades desde la capa de datos
        List<Registrable> entidadesIniciales =
                GestorEntidades.cargarEntidades();

        // Inicio de la interfaz gráfica, pasando las entidades cargadas
        MenuGUI.iniciar(entidadesIniciales);
    }
}
