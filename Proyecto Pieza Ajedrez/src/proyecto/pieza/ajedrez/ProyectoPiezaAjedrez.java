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
public class ProyectoPiezaAjedrez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Pieza peon = new Pieza("Peón", "Negro", "Adelante", 8);
        System.out.println("Pieza: "+ peon.getNombre());
        System.out.println("Color: " + peon.getColor());
        System.out.println("Movimiento: "+ peon.getMovimiento());
        System.out.println("Cantidad: " + peon.getCantidad());
       
       
       
    }
    
}
