package modelo;

/**
 * 
 * @author Uni
 */
public class Ruta {
    private int idRuta;
    private int idZona;

    public Ruta(int idRuta, int idZona) {
        this.idRuta = idRuta;
        this.idZona = idZona;
    }

    // Getters y Setters
    public int getIdRuta() { return idRuta; }
    public void setIdRuta(int idRuta) { this.idRuta = idRuta; }

    public int getIdZona() { return idZona; }
    public void setIdZona(int idZona) { this.idZona = idZona; }
}
