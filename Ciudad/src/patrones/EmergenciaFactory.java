package patrones;

import modelo.AccidenteVehicular;
import modelo.Emergencia;
import modelo.Incendio;
import modelo.Robo;

public class EmergenciaFactory {

    public static Emergencia crearEmergencia(String tipo, String ubicacion, int gravedad) {
        switch (tipo.toLowerCase()) {
            case "incendio" -> {
                return new Incendio(ubicacion, gravedad);
            }
            case "robo" -> {
                return new Robo(ubicacion, gravedad); // ERROR si Robo es abstracta
            }
            case "accidente" -> {
                return new AccidenteVehicular(ubicacion, gravedad); // ERROR si AccidenteVehicular es abstracta
            }
            default -> throw new IllegalArgumentException("Tipo de emergencia no válido");
        }
    }

    
}
