package cl.salmontt.colecciones.model;

/**
 * Clase abstracta que representa una unidad operativa genérica,
 * definida por un nombre y una comuna.
 *
 * Sirve como clase base para las distintas unidades del sistema.
 */
public abstract class UnidadOperativa implements Registrable {

    // Atributos comunes a todas las unidades operativas
    private String nombre;
    private String comuna;

    /**
     * Crea una nueva unidad operativa con nombre y comuna.
     *
     * @param nombre Nombre de la unidad.
     * @param comuna Comuna donde se ubica.
     */
    public UnidadOperativa(String nombre, String comuna) {
        this.nombre = nombre;
        this.comuna = comuna;
    }

    /**
     * Obtiene el nombre de la unidad operativa.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la unidad operativa.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la comuna donde se ubica la unidad operativa.
     */
    public String getComuna() {
        return comuna;
    }

    /**
     * Establece la comuna donde se ubica la unidad operativa.
     */
    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    /**
     * Sobrescribe el método toString heredado de Object
     * para entregar una representación genérica de la unidad operativa.
     */
    @Override
    public String toString() {
        return "Unidad Operativa: " +
                "Nombre : '" + nombre + '\'' +
                ", Comuna : '" + comuna;
    }

    /**
     * Método abstracto que debe ser implementado por cada subclase
     * para mostrar información específica de la unidad operativa.
     */
    public abstract void mostrarInformacion();

    /**
     * Método exigido por la interfaz Registrable.
     * Debe ser implementado por las clases concretas.
     */
    @Override
    public abstract void mostrarResumen();
}
