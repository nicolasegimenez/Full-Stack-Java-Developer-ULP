/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

/**
 *
 * @author nicoarkano
 */
public class Circulo {
    private final double PI = 3.14;
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
   public double calcularArea(){
   return radio*PI;
   } 
   
   public double calularPerimetro(){
   return (radio*PI)*(radio*PI);
   }
}
