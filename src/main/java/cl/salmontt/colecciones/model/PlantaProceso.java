package cl.salmontt.colecciones.model;

/**
 * Representa una planta de proceso con capacidad productiva,
 * heredando nombre y comuna desde UnidadOperativa.
 */
public class PlantaProceso extends UnidadOperativa {

    // Atributo específico de PlantaProceso
    private int capacidadProceso;

    /**
     * Crea una nueva planta de proceso.
     *
     * @param nombre Nombre de la planta.
     * @param comuna Comuna donde se ubica.
     * @param capacidadProceso Capacidad de proceso en unidades definidas.
     */
    public PlantaProceso(String nombre, String comuna, int capacidadProceso){
        super(nombre, comuna);
        this.capacidadProceso = capacidadProceso;
    }

    /**
     * Obtiene la capacidad de proceso de la planta.
     *
     * @return Capacidad de proceso.
     */
    public int getCapacidadProceso() {
        return capacidadProceso;
    }

    /**
     * Establece la capacidad de proceso de la planta.
     *
     * @param capacidadProceso Nueva capacidad de proceso.
     */
    public void setCapacidadProceso(int capacidadProceso) {
        this.capacidadProceso = capacidadProceso;
    }

    /**
     * Sobrescribe el método toString heredado de Object
     * para entregar una representación específica de la planta de proceso.
     */
    @Override
    public String toString() {
        return "Planta Proceso: " +
                "Nombre : '" + getNombre() + '\'' +
                ", Comuna : '" + getComuna() + '\'' +
                ", Capacidad de proceso : " + capacidadProceso;
    }

    /**
     * Implementación del método abstracto definido en UnidadOperativa.
     */
    @Override
    public void mostrarInformacion() {
        System.out.println("Planta de Proceso: " +
                "Nombre: '" + getNombre() + "', " +
                "Comuna: '" + getComuna() + "', " +
                "Capacidad de proceso: " + capacidadProceso);
    }

    /**
     * Implementación del contrato definido por la interfaz Registrable.
     */
    @Override
    public void mostrarResumen() {
        System.out.println(
                "[PlantaProceso] " + getNombre() +
                        " - Capacidad: " + capacidadProceso
        );
    }
}
