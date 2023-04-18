/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

/**
 *
 * @author nicoarkano
 */
public class Converter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conversor convertir = new Conversor();
        
        System.out.println(convertir.convertirAPesos(500));
        System.out.println(convertir.convertirADolares(25700));
        // TODO code application logic here
    }
    
}
