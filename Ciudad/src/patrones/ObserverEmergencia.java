package patrones;

import modelo.Emergencia;
import modelo.ServicioEmergencia;
import java.util.ArrayList;
import java.util.List;

public class ObserverEmergencia {
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
