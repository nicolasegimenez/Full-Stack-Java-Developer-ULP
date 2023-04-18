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

    @SuppressWarnings("empty-statement")

    
   
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
       
        
    public void elMayorEs(int a, int b, int c){
    
            if (a > b && a > c) {
                System.out.println("El numero "  + a + " es el mas grande");
                  
            }
            else if( b > a && b> c){
                System.out.println(b);
            }
            else if(a==b & a==c){
                System.out.println("Son iguales");}
            else{
                System.out.println(c);
            }
          
    }   
    public void elDiaEs(int num){
      
       switch(num) {
           case(1): {
               System.out.println("Lunes");
               break;
           }
           case(2): {
               System.out.println("Martes");
               break;
           }
           case(3): {
               System.out.println("Miercoles");
               break;
           }
           case(4): {
               System.out.println("Jueves");
               break;
           }
           case(5): {
               System.out.println("Viernes");
               break;
           }
           case(6): {
               System.out.println("Sabado");
               break;
           }
           case(7): {
               System.out.println("Domingo");
               break;
           }
           default: {
               System.out.println("No es un dia!!");
               break;
           }
       }
        
    
    }
      
    }
 