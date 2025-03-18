package modelo;

public class Robo extends Emergencia {
    public Robo(String ubicacion, int nivelGravedad) {
        super("Robo", ubicacion, nivelGravedad);
    }

    @Override
    public void manejarEmergencia() {
        System.out.println("Atendiendo robo en " + ubicacion);
    }