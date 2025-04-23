package main;

import patrones.EstrategiaAsignacion;
import patrones.AsignacionPorPrioridad;

public class ConfiguracionSistema {

    public static EstrategiaAsignacion obtenerEstrategiaAsignacion() {
        // Acá podés cambiar por otra estrategia si querés: AsignacionPorProximidad, etc.
        return new AsignacionPorPrioridad();
    }
}
