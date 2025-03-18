package  util;

import modelo.ServicioEmergencia;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroRecursos {
    public static List<ServicioEmergencia> filtrarPorTiempoRespuesta(List<ServicioEmergencia> servicios, int maxTiempo) {
        return servicios.stream()
                .filter(s -> s.getTiempoRespuesta() <= maxTiempo)
                .collect(Collectors.toList());
    }
    
    public static List<ServicioEmergencia> filtrarPorDistancia(List<ServicioEmergencia> servicios, String ubicacion, int maxDistancia) {
        return servicios.stream()
                .filter(s -> MapaUrbano.calcularDistancia(s.getUbicacion(), ubicacion) <= maxDistancia)
                .collect(Collectors.toList());
    }
}
