/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computadora;

/**
 *
 * @author nicoarkano
 */
public class Computadora {
    private String modelo;
    private int year;
    private boolean encendida;
    public Computadora( String _modelo, int _year, boolean _encendida){
    modelo= _modelo;
    year = _year;
    encendida = _encendida;
    
    }
    public Computadora(){};

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }
    
    
    
}
