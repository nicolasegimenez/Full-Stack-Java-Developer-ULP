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
public class Circle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo circulo = new Circulo(5.75);
        System.out.println("Area " + circulo.calcularArea() );
        System.out.println("Perimero " + circulo.calularPerimetro());
    }
    
}
