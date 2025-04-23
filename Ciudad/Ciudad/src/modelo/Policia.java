package modelo;  // O 'modelos', según tu estructura de carpetas

public class Policia implements ServicioEmergencia {

    @Override
    public void atenderEmergencia(Emergencia emergencia) {
        System.out.println("Policía atendiendo: " + emergencia.getTipo() + " en " + emergencia.getUbicacion());
    }

    @Override
    public int getTiempoRespuesta() {
        // Puedes poner un valor de tiempo de respuesta real
        return 7;  // Supongamos que la policía responde en 7 minutos
    }

    @Override
    public String getUbicacion() {
        // La ubicación puede depender de la situación, pero un valor fijo como ejemplo:
        return "Comisaría Central";  // Ubicación ficticia
    }
}
