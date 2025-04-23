package util;  

import java.util.List;
import java.util.stream.Collectors;
import modelo.ServicioEmergencia;  

public class FiltroRecursos {  
    
    // Filtra servicios de emergencia por tiempo de respuesta  
    public static List<ServicioEmergencia> filtrarPorTiempoRespuesta(List<ServicioEmergencia> servicios, int maxTiempo) {  
        return servicios.stream()  
            .filter(s -> s.getTiempoRespuesta() <= maxTiempo)  
            .collect(Collectors.toList());  
    }  

    // Filtra servicios de emergencia por distancia  
    public static List<ServicioEmergencia> filtrarPorDistancia(List<ServicioEmergencia> servicios, String ubicacion, int maxDistancia) {  
        return servicios.stream()  
            .filter(s -> MapaUrbano.calcularDistancia(s.getUbicacion(), ubicacion) <= maxDistancia)  
            .collect(Collectors.toList());  
    }  
}  