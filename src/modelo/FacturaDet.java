package modelo;

/**
 * 
 * @author Uni
 */
public class FacturaDet {
    private int anio;
    private int numSecuencial;
    private int idProducto;
    private int cantidad;
    private double precio;

    public FacturaDet(int anio, int numSecuencial, int idProducto, int cantidad, double precio) {
        this.anio = anio;
        this.numSecuencial = numSecuencial;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    // Getters y Setters
    public int getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }

    public int getNumSecuencial() { return numSecuencial; }
    public void setNumSecuencial(int numSecuencial) { this.numSecuencial = numSecuencial; }

    public int getIdProducto() { return idProducto; }
    public void setIdProducto(int idProducto) { this.idProducto = idProducto; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
}
