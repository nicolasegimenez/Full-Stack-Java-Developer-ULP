    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.utilitario;

/**
 *
 * @author nicoarkano
 */
public class Utilitario {
  
    private String cadena="";
    public void dibujaCuadrado(int _numero){
      

           //Parte Arriba
        for (int i = 0; i<_numero; i++){ 
            
            System.out.print("*");
            
           
        };
        System.out.println("");
       
  //El ciclo se repite 6 veces escribe * -> escribe 6 espacios -> escribe * y salta linea
  
         for (int i = 0; i< _numero-2; i++){
            //El primer caracter a la izquierda 
            System.out.print("*");
           
             for (int j = 0; j < _numero-2; j++){
                 
                 System.out.print(" ");           
             }
             
             //segundo caracter a la derecha 
             System.out.println("*");
        };
 
        
        //parte abajo
                for (int i = 0; i<_numero; i++){ 
                    System.out.print("*");
            
           
        };
       
        System.out.println(""); 
        }
       
        
       
      
    }
