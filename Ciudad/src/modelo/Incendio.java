package modelo;

public class Incendio extends Emergencia {  
    public Incendio(String ubicacion, int nivelGravedad) {  
        super("Incendio", ubicacion, nivelGravedad);  
    }  
    
    @Override  
    public void manejarEmergencia() {  
        System.out.println("Atendiendo incendio en " + ubicacion);  
    }  

    @Override
    public int getNivelGravedad() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getUbicacion() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}  