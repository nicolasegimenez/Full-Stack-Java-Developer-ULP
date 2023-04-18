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
public class ComputadoraMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computadora mac = new Computadora("macintosh", 2009, true);
        System.out.println("modelo: "+ mac.getModelo());
        System.out.println("Año: " + mac.getYear());
        System.out.println("Funcinando: " + mac.isEncendida());
        //no se puede hacer get a un boolean
        // TODO code application logic here
    }
    
}
