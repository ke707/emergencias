// Emergencia.java

package modelos;


public class Emergencia {
    private String tipo;
    private String descripcion;

    public Emergencia(String tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Emergencia [tipo=" + tipo + ", descripcion=" + descripcion + "]";
    }
}
