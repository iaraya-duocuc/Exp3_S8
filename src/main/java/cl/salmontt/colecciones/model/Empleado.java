package cl.salmontt.colecciones.model;

/**
 * Representa un empleado del sistema.
 */
public class Empleado extends Entidad {

    // Atributo específico del empleado
    private String cargo;

    /**
     * Crea un nuevo empleado con nombre y cargo.
     *
     * @param nombre Nombre del empleado.
     * @param cargo Cargo que desempeña.
     */
    public Empleado(String nombre, String cargo) {
        super(nombre);
        this.cargo = cargo;
    }

    /**
     * Obtiene el cargo del empleado.
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Implementación del contrato definido por la interfaz Registrable.
     */
    @Override
    public void mostrarResumen() {
        System.out.println(
                "[Empleado] " + getNombre() +
                        " | Cargo: " + cargo
        );
    }
}
