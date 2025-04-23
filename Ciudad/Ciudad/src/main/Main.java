package main;

import java.util.Scanner;
import modelo.*;
import patrones.SistemaEmergencias;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            SistemaEmergencias sistema = SistemaEmergencias.getInstance();
            boolean ejecutar = true;
            
            while (ejecutar) {
                System.out.println("\n=== SISTEMA DE GESTIÓN DE EMERGENCIAS ===");
                System.out.println("1. Registrar una nueva emergencia");
                System.out.println("2. Ver emergencias registradas");
                System.out.println("3. Atender una emergencia");
                System.out.println("4. Mostrar estadísticas");
                System.out.println("5. Salir");
                System.out.print("Seleccione una opción: ");
                
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Limpia el buffer
                
                switch (opcion) {
                    case 1 -> registrarEmergencia(scanner, sistema);
                    case 2 -> sistema.mostrarEmergencias();
                    case 3 -> atenderEmergencia();
                    case 4 -> mostrarEstadisticas();
                    case 5 -> {
                        ejecutar = false;
                        System.out.println("Saliendo del sistema...");
                    }
                    default -> System.out.println("Opción no válida. Intente de nuevo.");
                }
            }
        }
    }

    private static void registrarEmergencia(Scanner scanner, SistemaEmergencias sistema) {
        System.out.println("\n--- Registrar Emergencia ---");
        System.out.println("Tipo de emergencia:");
        System.out.println("1. Robo");
        System.out.println("2. Incendio");
        System.out.println("3. Accidente vehicular");
        System.out.print("Seleccione una opción: ");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        System.out.print("Descripción: ");
        String descripcion = scanner.nextLine();

        System.out.print("Ubicación: ");
        String ubicacion = scanner.nextLine();

        Emergencia emergencia = null;

        switch (tipo) {
            case 1 -> emergencia = new Robo(descripcion, ubicacion);
            case 2 -> emergencia = new Incendio(descripcion, ubicacion);
            case 3 -> emergencia = new AccidenteVehicular(descripcion, ubicacion);
            default -> System.out.println("Tipo de emergencia no válido.");
        }

        if (emergencia != null) {
            sistema.registrarEmergencia(emergencia);
            System.out.println("Emergencia registrada con éxito.");
        }
    }

    private static void atenderEmergencia() {
        System.out.println("\n--- Atender Emergencia ---");
        System.out.println("Simulación de asignación de recursos...");
        // Aquí podrías invocar lógica de asignación real del sistema
    }

    private static void mostrarEstadisticas() {
        System.out.println("\n--- Estadísticas del Sistema ---");
        System.out.println("Emergencias atendidas: 12");
        System.out.println("Tiempo promedio de respuesta: 8 min");
        System.out.println("Recursos utilizados: 70%");
        // En producción, podrías sacar estos datos del sistema
    }
}
