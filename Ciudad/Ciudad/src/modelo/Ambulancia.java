package modelos;  // O 'modelo', según tu carpeta

public class Ambulancia implements ServicioEmergencia {

    @Override
    public void atenderEmergencia(Emergencia emergencia) {
        System.out.println("Ambulancia atendiendo: " + emergencia.getTipo() + " - " + emergencia.getDescripcion());
    }

    @Override
    public int getTiempoRespuesta() {
        // Puedes poner un valor real aquí si tienes el dato, por ahora lo dejamos fijo
        return 10;  // Tiempo de respuesta ficticio (en minutos)
    }

    @Override
    public String getUbicacion() {
        // Ajusta la ubicación de la ambulancia según lo que necesites
        return "Base de Emergencias Central"; // Ubicación ficticia
    }
}
