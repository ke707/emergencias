package util;

import modelo.Emergencia;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HistorialEmergencias {
    private static final List<Emergencia> historial = new ArrayList<>();
    private static final List<Long> tiemposRespuesta = new ArrayList<>();
    
    public static void registrarEmergencia(Emergencia emergencia) {
        historial.add(emergencia);
    }
    
    public static void registrarTiempoRespuesta(long tiempo) {
        tiemposRespuesta.add(tiempo);
    }
    
    public static List<Emergencia> obtenerHistorial() {
        return new ArrayList<>(historial);
    }
    
    public static double calcularTiempoPromedioRespuesta() {
        return tiemposRespuesta.stream()
                .mapToLong(Long::longValue)
                .average()
                .orElse(0.0);
    }
    
    public static Map<String, Long> obtenerEstadisticasPorTipo() {
        return historial.stream()
                .collect(Collectors.groupingBy(e -> e.getClass().getSimpleName(), Collectors.counting()));
    }
}