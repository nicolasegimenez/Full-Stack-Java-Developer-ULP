/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.utilitario;
import java.io.IOException;

//Importe este scanner para leer el numero
import java.util.Scanner;

/**
 *
 * @author nicoarkano
 */
public class ProyectoUtilitario {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);
        // TODO code application logic here
        Utilitario utilitario = new Utilitario();
        utilitario.dibujaCuadrado(4);
        utilitario.elMayorEs(2 , 1, 2);
        System.out.println("Ingrese el dia");
        //aca use el scanner
        utilitario.elDiaEs(reader.nextInt());
    }
    
}
