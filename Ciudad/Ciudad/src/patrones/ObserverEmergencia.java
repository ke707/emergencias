package patrones;  

import java.util.ArrayList;  
import java.util.List;  
import modelo.Emergencia;  
import modelo.ServicioEmergencia;  

public class ObserverEmergencia {  
    @SuppressWarnings("FieldMayBeFinal")  
    private List<ServicioEmergencia> observadores = new ArrayList<>();  

    public void agregarObservador(ServicioEmergencia servicio) {  
        observadores.add(servicio);  
    }  

    public void removerObservador(ServicioEmergencia servicio) {  
        observadores.remove(servicio);  
    }  

    public void notificar(Emergencia emergencia) {  
        for (ServicioEmergencia servicio : observadores) {  
            servicio.atenderEmergencia(emergencia);  
        }  
    }  
}  