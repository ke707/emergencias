package patrones;

import modelo.Emergencia;

/**
 * Interfaz para definir la estrategia de asignación de emergencias.
 */
public interface EstrategiaAsignacion {
    /**
     * Método para asignar recursos según la estrategia definida.
     * 
     * @param emergencia La emergencia a la que se asignarán recursos.
     */
    void asignarRecursos(Emergencia emergencia);
}

