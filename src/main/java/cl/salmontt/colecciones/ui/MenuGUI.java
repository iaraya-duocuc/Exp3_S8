package cl.salmontt.colecciones.ui;

import cl.salmontt.colecciones.model.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Interfaz gráfica simple para la creación y visualización
 * de entidades del sistema utilizando JOptionPane.
 */
public class MenuGUI {

    // Colección polimórfica que almacena todas las entidades registrables
    private static List<Registrable> entidades = new ArrayList<>();

    /**
     * Inicializa la interfaz gráfica recibiendo las entidades iniciales.
     */
    public static void iniciar(List<Registrable> entidadesIniciales) {
        entidades = entidadesIniciales;
        mostrarMenu();
    }

    /**
     * Muestra el menú principal y gestiona la selección del usuario.
     */
    public static void mostrarMenu() {

        String opcion;

        do {
            opcion = JOptionPane.showInputDialog(
                    null,
                    "Seleccione una opción:\n" +
                            "1. Crear Proveedor\n" +
                            "2. Crear Empleado\n" +
                            "3. Mostrar Resumen\n" +
                            "0. Salir",
                    "Sistema de Gestión",
                    JOptionPane.QUESTION_MESSAGE
            );

            if (opcion == null) break;

            switch (opcion) {
                case "1":
                    crearProveedor();
                    break;
                case "2":
                    crearEmpleado();
                    break;
                case "3":
                    mostrarResumen();
                    break;
                case "0":
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
            }

        } while (!"0".equals(opcion));
    }

    /**
     * Crea un proveedor solicitando los datos por pantalla.
     */
    private static void crearProveedor() {

        String nombre = JOptionPane.showInputDialog("Ingrese nombre del proveedor:");
        String rubro = JOptionPane.showInputDialog("Ingrese rubro del proveedor:");

        if (esValido(nombre) && esValido(rubro)) {
            entidades.add(new Proveedor(nombre.trim(), rubro.trim()));
            JOptionPane.showMessageDialog(null, "Proveedor creado correctamente");
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Debe ingresar nombre y rubro válidos",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    /**
     * Crea un empleado solicitando los datos por pantalla.
     */
    private static void crearEmpleado() {

        String nombre = JOptionPane.showInputDialog("Ingrese nombre del empleado:");
        String cargo = JOptionPane.showInputDialog("Ingrese cargo del empleado:");

        if (esValido(nombre) && esValido(cargo)) {
            entidades.add(new Empleado(nombre.trim(), cargo.trim()));
            JOptionPane.showMessageDialog(null, "Empleado creado correctamente");
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Debe ingresar nombre y cargo válidos",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    /**
     * Muestra un resumen de todas las entidades registradas.
     */
    private static void mostrarResumen() {

        if (entidades.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay entidades registradas");
            return;
        }

        StringBuilder resumen = new StringBuilder();

        for (Registrable r : entidades) {
            // Uso de polimorfismo sobre la interfaz Registrable
            resumen.append(r.getClass().getSimpleName()).append("\n");
            resumen.append("---------------------\n");
            resumen.append(obtenerResumenTexto(r)).append("\n\n");
        }

        JOptionPane.showMessageDialog(
                null,
                resumen.toString(),
                "Resumen de Entidades",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    /**
     * Obtiene una representación textual según el tipo concreto de la entidad.
     */
    private static String obtenerResumenTexto(Registrable r) {

        if (r instanceof Proveedor) {
            Proveedor p = (Proveedor) r;
            return "Proveedor: " + p.getNombre() + " | Rubro: " + p.getRubro();
        }

        if (r instanceof Empleado) {
            Empleado e = (Empleado) r;
            return "Empleado: " + e.getNombre() + " | Cargo: " + e.getCargo();
        }

        if (r instanceof CentroCultivo) {
            CentroCultivo cc = (CentroCultivo) r;
            return "Centro de cultivo: " + cc.getNombre() + " | Comuna: " + cc.getComuna();
        }

        if (r instanceof PlantaProceso) {
            PlantaProceso pp = (PlantaProceso) r;
            return "Planta de proceso: " + pp.getNombre() + " | Comuna: " + pp.getComuna();
        }

        return "Entidad desconocida";
    }

    /**
     * Valida que el texto no sea nulo ni esté vacío.
     */
    private static boolean esValido(String texto) {
        return texto != null && !texto.trim().isEmpty();
    }
}
