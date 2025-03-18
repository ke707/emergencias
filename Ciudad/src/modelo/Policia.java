package  modelo;

public class Policia implements ServicioEmergencia {
    @Override
    public void atenderEmergencia(Emergencia emergencia) {
        System.out.println("Policía atendiendo: " + emergencia.tipo);
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
