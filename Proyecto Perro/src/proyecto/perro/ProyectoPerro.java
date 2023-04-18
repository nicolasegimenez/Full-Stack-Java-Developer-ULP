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
public class ProyectoPerro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro perroOlivia = new Perro("Olivia","BullDog Francés", 1.2, 1);
        System.out.println(perroOlivia.mostrarInfo());
    }
    
}
