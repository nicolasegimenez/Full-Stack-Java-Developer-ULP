/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectojugador;

/**
 *
 * @author nicoarkano
 */
public class ProyectoJugador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jugador player = new Jugador();
       player.setNacionalidad("Argentino");
       player.setEdad(19);
       player.setNombre("Juan");
       player.setPuntaje(140);
        System.out.println("Nombre: " + player.getNombre());
        System.out.println("Nacionalidad: " + player.getNacionalidad());
        System.out.println("Edad: " + player.getEdad());
        System.out.println("Puntaje: " + player.getPuntaje());
    }
    
}
