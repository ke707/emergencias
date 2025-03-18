package patrones;

import modelo.*;

public class EmergenciaFactory {
    public static Emergencia crearEmergencia(String tipo, String ubicacion, int nivelGravedad) {
        return switch (tipo.toLowerCase()) {
            case "incendio" -> new Incendio(ubicacion, nivelGravedad);
            case "accidente" -> new AccidenteVehicular(ubicacion, nivelGravedad);
            case "robo" -> new Robo(ubicacion, nivelGravedad);
            default -> throw new IllegalArgumentException("Tipo de emergencia desconocido");
        };
    }
}
