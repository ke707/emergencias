
package patrones;  

import modelo.Emergencia;  

public interface PrioridadEstrategia {  
    /**  
     * Método para calcular la prioridad de una emergencia.  
     *  
     * @param emergencia La emergencia a la que se calculará la prioridad.  
     * @return Un entero representando la prioridad de la emergencia.  
     */  
    int calcularPrioridad(Emergencia emergencia);  
}  