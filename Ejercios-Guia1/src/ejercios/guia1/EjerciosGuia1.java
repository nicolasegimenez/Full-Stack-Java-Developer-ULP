/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercios.guia1;

/**
 *
 * @author nicoarkano
 */
public class EjerciosGuia1 {

    
    public static void main(String[] args) {
     Producto alfajor = new Producto(213123, "alfajor de maicena", 10);
        System.out.println("Codigo: "+ alfajor.codigo);
        System.out.println("Producto: " + alfajor.descripcion);
        System.out.println("Cantidad: " + alfajor.stock);
    }
  
}
