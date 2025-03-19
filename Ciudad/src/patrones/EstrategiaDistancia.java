package patrones;

import modelo.Emergencia;
import util.MapaUrbano;

public class EstrategiaDistancia implements PrioridadEstrategia {
    private final String baseOperaciones;
    private Object MapaUrbano;
    
    public EstrategiaDistancia(String baseOperaciones) {
        this.baseOperaciones = baseOperaciones;
    }
    
    @SuppressWarnings("static-access")
    @Override
    public int calcularPrioridad(Emergencia emergencia) {
        return ((MapaUrbano) MapaUrbano).calcularDistancia(baseOperaciones, emergencia.ubicacion);
    }
}