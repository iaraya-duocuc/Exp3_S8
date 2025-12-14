package cl.salmontt.colecciones.model;

/**
 * Representa un centro de cultivo con su producción anual en toneladas,
 * heredando nombre y comuna desde UnidadOperativa.
 */
public class CentroCultivo extends UnidadOperativa {

    // Atributo específico de CentroCultivo
    private int toneladasProducidas;

    /**
     * Crea un nuevo centro de cultivo.
     *
     * @param nombre Nombre del centro.
     * @param comuna Comuna donde se ubica.
     * @param toneladasProducidas Toneladas producidas por el centro.
     */
    public CentroCultivo(String nombre, String comuna, int toneladasProducidas){
        super(nombre, comuna);
        this.toneladasProducidas = toneladasProducidas;
    }

    /**
     * Obtiene las toneladas producidas por el centro.
     *
     * @return Toneladas producidas.
     */
    public int getToneladasProducidas() {
        return toneladasProducidas;
    }

    /**
     * Establece las toneladas producidas por el centro.
     *
     * @param toneladasProducidas Nueva cantidad de toneladas producidas.
     */
    public void setToneladasProducidas(int toneladasProducidas) {
        this.toneladasProducidas = toneladasProducidas;
    }

    /**
     * Sobrescribe el método toString heredado de Object
     * para entregar una representación específica del centro de cultivo.
     */
    @Override
    public String toString() {
        return "Centro Cultivo: " +
                "Nombre : '" + getNombre() + '\'' +
                ", Comuna : '" + getComuna() + '\'' +
                ", Toneladas producidas : " + toneladasProducidas;
    }

    /**
     * Implementación del método abstracto definido en UnidadOperativa.
     */
    @Override
    public void mostrarInformacion() {
        System.out.println("Centro de Cultivo: " +
                "Nombre: '" + getNombre() + "', " +
                "Comuna: '" + getComuna() + "', " +
                "Toneladas producidas: " + toneladasProducidas);
    }

    /**
     * Implementación del contrato definido por la interfaz Registrable.
     */
    @Override
    public void mostrarResumen() {
        System.out.println(
                "[CentroCultivo] " + getNombre() +
                        " (" + getComuna() + ")"
        );
    }
}
