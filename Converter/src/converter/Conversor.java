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
public class Conversor {

    public Conversor() {
    }
    
    public double convertirAPesos(int _dolares){
    
    return _dolares*392;
    }
    
    public double convertirADolares(int _pesos){
    return _pesos/392; 
    }
    
}
