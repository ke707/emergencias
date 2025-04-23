package patrones;

import java.util.ArrayList;
import java.util.List;
import modelo.Emergencia;

public class CentroDeControl extends ObserverEmergencia {
    private final List<Emergencia> emergenciasPendientes = new ArrayList<>();

    @Override
    public void actualizar(Emergencia emergencia) {
        // Mostrar mensaje de actualización de emergencia
        System.out.println("Centro de Control: Nueva actualización de emergencia en " 
                            + emergencia.getUbicacion());
        
        // Agregar la emergencia a la lista de pendientes
        emergenciasPendientes.add(emergencia);
    }

    // Obtener las emergencias pendientes
    public List<Emergencia> getEmergenciasPendientes() {
        return emergenciasPendientes;
    }
}
