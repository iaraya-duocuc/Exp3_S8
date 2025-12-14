package cl.salmontt.colecciones.data;

import cl.salmontt.colecciones.model.CentroCultivo;
import cl.salmontt.colecciones.model.PlantaProceso;
import cl.salmontt.colecciones.model.UnidadOperativa;

import java.util.ArrayList;
import java.util.List;

public class GestorUnidades {

    public static List<UnidadOperativa> cargarUnidades() {

        List<UnidadOperativa> unidades = new ArrayList<>();

        // Agregar objetos
        unidades.add(new PlantaProceso("Planta Sur", "Puerto Montt", 5000));
        unidades.add(new PlantaProceso("Planta Norte", "Coquimbo", 3200));
        unidades.add(new CentroCultivo("Centro Pacífico", "Quellón", 2100));
        unidades.add(new CentroCultivo("Centro Andes", "Cochamó", 1800));

        return unidades;
    }
}
