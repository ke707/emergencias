package patrones;

import modelo.Emergencia;

public class AsignacionPorProximidad implements PrioridadEstrategia {
    @Override
    public int calcularPrioridad(Emergencia emergencia) {
        // Supongamos que la emergencia tiene una distancia asignada
        return 100 - emergencia.getDistancia(); // Menor distancia = mayor prioridad
    }
}

