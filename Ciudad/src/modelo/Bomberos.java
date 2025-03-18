package modelo;

public class Bomberos implements ServicioEmergencia {
    @Override
    public void atenderEmergencia(Emergencia emergencia) {
        System.out.println("Bomberos atendiendo: " + emergencia.tipo);
    }
}
