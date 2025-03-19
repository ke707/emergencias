package modelo;

public abstract class Robo extends Emergencia {
    public Robo(String ubicacion, int nivelGravedad) {
        super("Robo", ubicacion, nivelGravedad);
    }

    @Override
    public void manejarEmergencia() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
