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
public class ProyectoCuadrilatero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //hardcodear
        Cuadrilatero cuadrilatero = new Cuadrilatero(50, 70);
        System.out.println("Area " + cuadrilatero.calcularArea());
        System.out.println("Perimetro " + cuadrilatero.calcularPerimetro());
        System.out.println("Es un cuadrado "+ cuadrilatero.esUnCuadrado());
        cuadrilatero.setAlto((int) cuadrilatero.getLargo());
        System.out.println("Es un cuadrado "+ cuadrilatero.esUnCuadrado());
    }
    
}
