package cl.salmontt.colecciones.data;

import cl.salmontt.colecciones.model.*;

import java.util.ArrayList;
import java.util.List;

public class GestorEntidades {

    public static List<Registrable> cargarEntidades() {

        List<Registrable> entidades = new ArrayList<>();

        // Unidades operativas
        entidades.add(new CentroCultivo("Centro Fiordo", "Aysén", 1500));
        entidades.add(new PlantaProceso("Planta Sur", "Puerto Montt", 5000));

        // Nuevas entidades
        entidades.add(new Proveedor("AquaFeed Ltda.", "Alimentos"));
        entidades.add(new Empleado("Juan Pérez", "Supervisor"));

        return entidades;
    }

    public static void mostrarResumenEntidades() {

        for (Registrable r : cargarEntidades()) {

            r.mostrarResumen(); // polimorfismo puro

            if (r instanceof CentroCultivo) {
                System.out.println("→ Tipo: Centro de cultivo");
            } else if (r instanceof PlantaProceso) {
                System.out.println("→ Tipo: Planta de proceso");
            } else if (r instanceof Proveedor) {
                System.out.println("→ Tipo: Proveedor externo");
            } else if (r instanceof Empleado) {
                System.out.println("→ Tipo: Personal interno");
            }
        }
    }
}
