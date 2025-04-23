package patrones;

import modelo.Emergencia;

public class AsignacionPorProximidad implements PrioridadEstrategia {
    
    @Override
    public int calcularPrioridad(Emergencia emergencia) {
        // Suponemos que la emergencia tiene una propiedad 'distancia' asignada
        return 100 - emergencia.getDistancia();  // Menor distancia = mayor prioridad
    }
}
