package cl.salmontt.colecciones.model;

/**
 * Representa un proveedor externo del sistema.
 */
public class Proveedor extends Entidad {

    // Atributo específico del proveedor
    private String rubro;

    /**
     * Crea un nuevo proveedor con nombre y rubro asociado.
     *
     * @param nombre Nombre del proveedor.
     * @param rubro Rubro o área de servicio del proveedor.
     */
    public Proveedor(String nombre, String rubro) {
        super(nombre);
        this.rubro = rubro;
    }

    /**
     * Obtiene el rubro del proveedor.
     */
    public String getRubro() {
        return rubro;
    }

    /**
     * Implementación del contrato definido por la interfaz Registrable.
     */
    @Override
    public void mostrarResumen() {
        System.out.println(
                "[Proveedor] " + getNombre() +
                        " | Rubro: " + rubro
        );
    }
}
