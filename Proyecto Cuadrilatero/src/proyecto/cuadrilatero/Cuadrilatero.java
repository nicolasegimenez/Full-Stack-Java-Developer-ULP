/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.cuadrilatero;

/**
 *
 * @author nicoarkano
 */
public class Cuadrilatero {
    private double alto;
    private double largo;
    private boolean cuadrado;

    public Cuadrilatero(int alto, int largo) {
        this.alto = alto;
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
    
    public double calcularPerimetro(){
    return largo*2 + alto*2;
    }
    public double calcularArea(){
    return largo*alto;
    }

    public void setCuadrado(boolean cuadrado) {
        this.cuadrado = cuadrado;
    }
    
    
    
    public boolean  esUnCuadrado(){
    if (alto == largo){
    setCuadrado(true);
    }
    return cuadrado;
    }
    
}
