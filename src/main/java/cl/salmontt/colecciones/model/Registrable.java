package cl.salmontt.colecciones.model;

/**
 * Contrato común para todas las entidades gestionables del sistema.
 */
public interface Registrable {

    /**
     * Muestra un resumen corto de la entidad.
     * Es la firma del método que las entidades deben implementar
     */
    void mostrarResumen();
}
