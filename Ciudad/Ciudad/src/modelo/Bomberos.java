package modelos;  // O 'modelo', según la carpeta

public class Bomberos implements ServicioEmergencia {

    @Override
    public void atenderEmergencia(Emergencia emergencia) {
        System.out.println("Bomberos atendiendo: " + emergencia.getTipo() + " - " + emergencia.getDescripcion());
    }

    @Override
    public int getTiempoRespuesta() {
        // Tiempo de respuesta ficticio (en minutos). Puedes ajustarlo según tus necesidades.
        return 5;  // Supongamos que bomberos responden en 5 minutos
    }

    @Override
    public String getUbicacion() {
        // Ubicación ficticia. Ajusta esto según lo que necesites.
        return "Estación Central de Bomberos";  // Ubicación ficticia
    }
}
