package main;

import modelo.*;
import patrones.*;
import java.util.Scanner;

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
                scanner.nextLine();
                
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
        System.out.println("\n--- Registrar Nueva Emergencia ---");
        System.out.println("1. Incendio  2. Robo  3. Accidente Vehicular");
        System.out.print("Seleccione el tipo: ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese la ubicación: ");
        String ubicacion = scanner.nextLine();

        System.out.print("Ingrese el nivel de gravedad (1-10): ");
        int gravedad = scanner.nextInt();

        Emergencia emergencia = null;
        switch (tipo) {
            case 1 -> emergencia = new Incendio(ubicacion, gravedad);
            case 2 -> emergencia = new Robo(ubicacion, gravedad);
            case 3 -> {
            }
            default -> {
                System.out.println("Tipo no válido.");
                return;
            }
        }
        sistema.registrarEmergencia(emergencia);
    }

    private static void atenderEmergencia() {
        System.out.println("\n--- Atender Emergencia ---");
        System.out.println("Simulación de asignación de recursos...");
    }

    private static void mostrarEstadisticas() {
        System.out.println("\n--- Estadísticas del Sistema ---");
        System.out.println("Emergencias atendidas: 12");
        System.out.println("Tiempo promedio de respuesta: 8 min");
        System.out.println("Recursos utilizados: 70%");
    }
}
