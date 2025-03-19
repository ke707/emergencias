package modelo;

public class Bomberos implements ServicioEmergencia {
    @Override
    public void atenderEmergencia(Emergencia emergencia) {
        System.out.println("Bomberos atendiendo: " + emergencia.tipo);
    }

    @Override
    public int getTiempoRespuesta() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getUbicacion() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
