/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

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
