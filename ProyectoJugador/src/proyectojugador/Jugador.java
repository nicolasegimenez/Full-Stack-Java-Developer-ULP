/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectojugador;

/**
 *
 * @author nicoarkano
 */
public class Jugador {
        private String nombre;
        private int puntaje;
        private String nacionalidad;
        private int edad;

    public Jugador(String _nombre, int _puntaje, String _nacionalidad, int _edad) {
        this.nombre = _nombre;
        this.puntaje = _puntaje;
        this.nacionalidad = _nacionalidad;
        this.edad = _edad;
    }

    public Jugador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
        
        
}
