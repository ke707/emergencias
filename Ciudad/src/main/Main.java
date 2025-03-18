package main;

import modelo.*;
import patrones.SistemaEmergencias;
import util.HistorialEmergencias;

public class Main {
    public static void main(String[] args) {
        SistemaEmergencias sistema = SistemaEmergencias.getInstancia();

        // Registrar servicios de emergencia
        sistema.registrarServicio(new Bomberos());
        sistema.registrarServicio(new Ambulancia());
        sistema.registrarServicio(new Policia());

        // Reportar algunas emergencias de prueba
        sistema.reportarEmergencia("Incendio", "Centro", 5);
        sistema.reportarEmergencia("AccidenteVehicular", "Avenida Principal", 3);
        sistema.reportarEmergencia("Robo", "Zona Norte", 4);

        // Atender emergencias
        sistema.atenderEmergencia();
        sistema.atenderEmergencia();
        sistema.atenderEmergencia();

        // Mostrar estadísticas
        System.out.println("Tiempo promedio de respuesta: " + HistorialEmergencias.calcularTiempoPromedioRespuesta() + " ms");
        System.out.println("Emergencias atendidas por tipo: " + HistorialEmergencias.obtenerEstadisticasPorTipo());
    }
}
