package modelo;

public interface ServicioEmergencia {
    void atenderEmergencia(Emergencia emergencia);

    int getTiempoRespuesta();

    String getUbicacion();
}

