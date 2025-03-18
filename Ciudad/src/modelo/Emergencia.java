package modelo;

public abstract class Emergencia {
    public String tipo;
    public String ubicacion;
    public int nivelGravedad;
    protected long tiempoReporte;

    public Emergencia(String tipo, String ubicacion, int nivelGravedad) {
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.nivelGravedad = nivelGravedad;
        this.tiempoReporte = System.currentTimeMillis();
    }

    public abstract void manejarEmergencia();
}
