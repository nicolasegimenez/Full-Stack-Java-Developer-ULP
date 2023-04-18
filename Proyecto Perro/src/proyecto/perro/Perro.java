/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.perro;

/**
 *
 * @author nicoarkano
 */
public class Perro {
    private String nombre;
    private String raza;
    private double peso;
    private int edad;

    public Perro(String nombre, String raza, double peso, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.peso = peso;
        this.edad = edad;
    }

    public Perro() {
    }
//Mostrar toda la info del perro
   public String mostrarInfo() {
   return "El nombre es " + nombre + " La raza es " + raza + " tiene " + edad + " año/s "
           + "y pesa " + peso + " Kilos";
   } 
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
