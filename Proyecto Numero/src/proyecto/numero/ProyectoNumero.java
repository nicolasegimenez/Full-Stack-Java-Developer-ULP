/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.numero;

/**
 *
 * @author nicoarkano
 */
public class ProyectoNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Numero numeroPar = new Numero(1459);
        System.out.println(numeroPar.getNumero());
        System.out.println("es par: " + numeroPar.esPar());
        System.out.println("es positivo: " + numeroPar.esPositivo());
        System.out.println("Es multiplo de " + numeroPar.esMultiploDe(3));
    }
    
}
