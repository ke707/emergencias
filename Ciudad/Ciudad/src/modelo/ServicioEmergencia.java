package modelo;  // O 'modelos', según tu estructura de carpetas

public interface ServicioEmergencia {
    // Método para atender la emergencia
    void atenderEmergencia(Emergencia emergencia);

    // Método para obtener el tiempo de respuesta del servicio
    int getTiempoRespuesta();

    // Método para obtener la ubicación del servicio
    String getUbicacion();
}
