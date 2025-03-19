package patrones;
import java.util.PriorityQueue;
import modelo.*;
import util.HistorialEmergencias;

public class SistemaEmergencias {
    private static volatile SistemaEmergencias instancia;
    private static final Object lock = new Object();

    public static SistemaEmergencias getInstance() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    private final ObserverEmergencia observer;
    private PrioridadEstrategia estrategia;
    @SuppressWarnings("FieldMayBeFinal")
    private PriorityQueue<Emergencia> colaEmergencias;
    
    private SistemaEmergencias() {
        observer = new ObserverEmergencia();
        estrategia = new EstrategiaGravedad();
        colaEmergencias = new PriorityQueue<>((e1, e2) -> estrategia.calcularPrioridad(e2) - estrategia.calcularPrioridad(e1));
    }
    
    public static SistemaEmergencias getInstancia() {
        SistemaEmergencias instancia = SistemaEmergencias.instancia;
        if (instancia == null) {
            synchronized (lock) {
                instancia = SistemaEmergencias.instancia;
                if (instancia == null) {
                    SistemaEmergencias.instancia = instancia = new SistemaEmergencias();
                }
            }
        }
        return instancia;
    }
    
    public void setEstrategia(PrioridadEstrategia estrategia) {
        this.estrategia = estrategia;
    }
    
    public void registrarServicio(ServicioEmergencia servicio) {
        observer.agregarObservador(servicio);
    }
    
    public void removerServicio(ServicioEmergencia servicio) {
        observer.removerObservador(servicio);
    }
    
    public void reportarEmergencia(String tipo, String ubicacion, int nivelGravedad) {
        Emergencia emergencia = EmergenciaFactory.crearEmergencia(tipo, ubicacion, nivelGravedad);
        colaEmergencias.add(emergencia);
        System.out.println("Nueva emergencia registrada: " + emergencia.tipo + " en " + ubicacion);
        HistorialEmergencias.registrarEmergencia(emergencia);
        observer.notificar(emergencia);
    }
    
    public void atenderEmergencia() {
        if (!colaEmergencias.isEmpty()) {
            Emergencia emergencia = colaEmergencias.poll();
            long tiempoInicio = System.currentTimeMillis();
            observer.notificar(emergencia);
            long tiempoFinal = System.currentTimeMillis();
            HistorialEmergencias.registrarTiempoRespuesta(tiempoFinal - tiempoInicio);
            System.out.println("Emergencia atendida: " + emergencia.tipo);
        }
    }

    public void registrarEmergencia(Emergencia emergencia) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object mostrarEmergencias() {
        
        throw new UnsupportedOperationException("Unimplemented method 'mostrarEmergencias'");
    }
}
