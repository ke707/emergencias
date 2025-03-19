    package patrones;

import modelo.Emergencia;

public class AsignacionPorPrioridad implements PrioridadEstrategia {
    @Override
    public int calcularPrioridad(Emergencia emergencia) {
        return emergencia.getNivelGravedad(); // Mayor gravedad = mayor prioridad
    }
}


