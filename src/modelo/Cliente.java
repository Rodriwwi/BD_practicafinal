package modelo;

/**
 * 
 * @author Uni
 */
public class Cliente {

    private int idCliente;
    private int idRuta;
    private String nombre;
    private String direccion;

    public Cliente(int idCliente, int idRuta, String nombre, String direccion) {
        this.idCliente = idCliente;
        this.idRuta = idRuta;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    // Getters y Setters
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
