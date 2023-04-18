/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

/**
 *
 * @author nicoarkano
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Libro platero = new Libro ("1313218913", "Platero", "Hector Jimenez", 01);
     Libro harryPotter = new Libro ("212139031", "Harry Potter y las reliquias de la muerte", " Jk rowling",1999);
     
     
     System.out.println("titulo: " + platero.getTitulo());
     System.out.println("titulo: " + harryPotter.getTitulo());
     
     
    platero.setEdicion(2023);
    System.out.println("edicion " + platero.getEdicion());
    }
    
}
