package modelos;  // O 'modelo', según la carpeta

public abstract class Emergencia {
    private String tipo;
    private String ubicacion;
    private int nivelGravedad;
    protected long tiempoReporte;

    public Emergencia(String tipo, String ubicacion, int nivelGravedad) {
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.nivelGravedad = nivelGravedad;
        this.tiempoReporte = System.currentTimeMillis();
    }

    // Métodos abstractos que deben ser implementados por las clases hijas
    public abstract void manejarEmergencia();

    public abstract int getNivelGravedad();

    // Método getDistancia() puede ser opcional, si no lo vas a usar puedes eliminarlo
    public int getDistancia() {
        // Si no lo necesitas, puedes eliminarlo o implementarlo en clases hijas
        throw new UnsupportedOperationException("Not supported yet.");
    }

    // Método getUbicacion() se implementa aquí porque todas las emergencias tendrán ubicación
    public String getUbicacion() {
        return this.ubicacion;
    }

    // Métodos de acceso para tipo, ubicacion y nivelGravedad
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNivelGravedad() {
        return nivelGravedad;
    }

    public void setNivelGravedad(int nivelGravedad) {
        this.nivelGravedad = nivelGravedad;
    }

    public long getTiempoReporte() {
        return tiempoReporte;
    }

    public void setTiempoReporte(long tiempoReporte) {
        this.tiempoReporte = tiempoReporte;
    }
}
