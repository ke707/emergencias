package modelo;

public abstract class AccidenteVehicular extends Emergencia {
    public AccidenteVehicular(String ubicacion, int nivelGravedad) {
        super("Accidente Vehicular", ubicacion, nivelGravedad);
    }

    @Override
    public void manejarEmergencia() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
