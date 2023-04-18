/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pieza.ajedrez;

/**
 *
 * @author nicoarkano
 */
public class Pieza {
    private String nombre;
    private String color;
    private String movimiento;
    private int cantidad;

    public Pieza(String nombre, String color, String movimiento, int cantidad) {
        this.nombre = nombre;
        this.color = color;
        this.movimiento = movimiento;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
