package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AsignacionPorPrioridad {

    private List<Emergencia> emergenciasPendientes;
    private List<ServicioEmergencia> serviciosDisponibles;

    public AsignacionPorPrioridad() {
        emergenciasPendientes = new ArrayList<>();
        serviciosDisponibles = new ArrayList<>();
    }

    // Registrar una emergencia
    public void registrarEmergencia(Emergencia emergencia) {
        emergenciasPendientes.add(emergencia);
    }

    // Registrar un servicio de emergencia
    public void registrarServicioEmergencia(ServicioEmergencia servicio) {
        serviciosDisponibles.add(servicio);
    }

    // Asignar servicio a emergencias pendientes según la prioridad
    public void asignarServicios() {
        // Primero, ordenamos las emergencias por prioridad (nivel de gravedad)
        Collections.sort(emergenciasPendientes, (e1, e2) -> Integer.compare(e2.obtenerPrioridad(), e1.obtenerPrioridad()));

        // Asignar servicios de emergencia a las emergencias
        for (Emergencia emergencia : emergenciasPendientes) {
            if (!serviciosDisponibles.isEmpty()) {
                ServicioEmergencia servicioAsignado = serviciosDisponibles.get(0);  // Elegimos el primer servicio disponible
                System.out.println("Asignando " + servicioAsignado.getClass().getSimpleName() + " a la emergencia: " + emergencia.tipo);
                servicioAsignado.atenderEmergencia(emergencia);
                serviciosDisponibles.remove(0);  // Remover el servicio después de asignarlo
            } else {
                System.out.println("No hay servicios disponibles para atender la emergencia: " + emergencia.tipo);
            }
        }
    }
}
