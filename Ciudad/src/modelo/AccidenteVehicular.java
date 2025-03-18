package modelo;


public class AccidenteVehicular extends Emergencia {
    public AccidenteVehicular(String ubicacion, int nivelGravedad) {
        super("Accidente Vehicular", ubicacion, nivelGravedad);
    }

    @Override
    public void manejarEmergencia() {
        System.out.println("Atendiendo accidente vehicular en " + getUbicacion());
            }
        
            private String getUbicacion() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'getUbicacion'");
            }
}
