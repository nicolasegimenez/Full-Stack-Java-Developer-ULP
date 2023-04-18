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
public class Numero {
    private int numero;
    private boolean retorno;
    
    public Numero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    private void setRetorno(boolean _retorno){
    this.retorno = _retorno;
    }
    
    
    public boolean esPar(){
    if (numero%2 == 0){
        setRetorno(true);
    }
    return retorno;
    }
    public boolean esPositivo(){
    if (numero > 0){
        setRetorno(true);
    }
    return retorno;
    }
    
    public boolean esMultiploDe(int _numeroDiv){
    if (numero/_numeroDiv==0){
    setRetorno(true);
    }
    return retorno;
    
    }
    
}
