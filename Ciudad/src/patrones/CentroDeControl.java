package patrones;

import java.util.ArrayList;
import java.util.List;
import modelo.Emergencia;

public class CentroDeControl extends ObserverEmergencia {
    private final List<Emergencia> emergenciasPendientes = new ArrayList<>();

    public void actualizar(Emergencia emergencia) {
        System.out.println("Centro de Control: Nueva actualización de emergencia en " 
                            + emergencia.getUbicacion());
        emergenciasPendientes.add(emergencia);
    }

    public List<Emergencia> getEmergenciasPendientes() {
        return emergenciasPendientes;
    }
}
