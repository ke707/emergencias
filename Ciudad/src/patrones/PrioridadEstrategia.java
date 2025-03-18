package patrones;

import modelo.Emergencia;

public interface PrioridadEstrategia {
    int calcularPrioridad(Emergencia emergencia);
}

