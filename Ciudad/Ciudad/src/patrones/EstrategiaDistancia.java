package patrones;  

import modelo.Emergencia;  
import util.MapaUrbano;  

public class EstrategiaDistancia implements PrioridadEstrategia {  
    private final String baseOperaciones;  
    private final MapaUrbano mapaUrbano;  

    public EstrategiaDistancia(String baseOperaciones) {  
        this.baseOperaciones = baseOperaciones;  
        this.mapaUrbano = new MapaUrbano(); // Asegúrate de inicializar correctamente el mapa  
    }  

    @SuppressWarnings("static-access")  
    @Override  
    public int calcularPrioridad(Emergencia emergencia) {  
        return mapaUrbano.calcularDistancia(baseOperaciones, emergencia.ubicacion);  
    }  
}  
