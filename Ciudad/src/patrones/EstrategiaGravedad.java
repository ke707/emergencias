package patrones;

import modelo.Emergencia;

public class EstrategiaGravedad implements PrioridadEstrategia {
    @Override
    public int calcularPrioridad(Emergencia emergencia) {
        return emergencia.nivelGravedad;
    }
}