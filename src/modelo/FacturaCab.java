package modelo;

/**
 * 
 * @author Uni
 */
public class FacturaCab {
    private int anio;
    private int numSecuencial;
    private int idCliente;

    public FacturaCab(int anio, int numSecuencial, int idCliente) {
        this.anio = anio;
        this.numSecuencial = numSecuencial;
        this.idCliente = idCliente;
    }

    // Getters y Setters
    public int getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }

    public int getNumSecuencial() { return numSecuencial; }
    public void setNumSecuencial(int numSecuencial) { this.numSecuencial = numSecuencial; }

    public int getIdCliente() { return idCliente; }
    public void setIdCliente(int idCliente) { this.idCliente = idCliente; }
}