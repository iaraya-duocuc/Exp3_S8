package cl.salmontt.colecciones.model;

/**
 * Clase base abstracta para entidades generales del sistema
 * que no corresponden a unidades operativas.
 */
public abstract class Entidad implements Registrable {

    // Atributo común a todas las entidades generales
    private String nombre;

    /**
     * Crea una nueva entidad con un nombre asociado.
     *
     * @param nombre Nombre de la entidad.
     */
    public Entidad(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el nombre de la entidad.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método exigido por la interfaz Registrable.
     * Debe ser implementado por las clases concretas.
     */
    @Override
    public abstract void mostrarResumen();
}
