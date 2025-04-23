package modelo;

public class RoboEnCasa extends Robo {

    public RoboEnCasa(String ubicacion, int nivelGravedad) {
        super(ubicacion, nivelGravedad);
    }

    @Override
    public void manejarEmergencia() {
        // Aquí implementas la lógica específica para manejar un robo en casa
        System.out.println("Atendiendo robo en casa en " + getUbicacion() + " con nivel de gravedad: " + getNivelGravedad());
    }
}
