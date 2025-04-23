package modelos;  // O 'modelo', según tu carpeta

public class Incendio extends Emergencia {  

    public Incendio(String ubicacion, int nivelGravedad) {  
        super("Incendio", ubicacion, nivelGravedad);  
    }  
    
    @Override  
    public void manejarEmergencia() {  
        System.out.println("Atendiendo incendio en " + getUbicacion() + " con nivel de gravedad: " + getNivelGravedad());
    }  

    @Override
    public int getNivelGravedad() {
        return super.getNivelGravedad();  // Devuelve el nivel de gravedad desde la clase base
    }

    // No es necesario sobreescribir getUbicacion() ya que lo heredas de Emergencia
}
