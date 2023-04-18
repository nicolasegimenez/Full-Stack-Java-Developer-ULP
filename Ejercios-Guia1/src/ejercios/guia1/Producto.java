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
public class Producto {
    public int codigo;
    public String descripcion;
    public int stock;
    
    public Producto(int _codigo, String _descripcion, int _stock ){
        this.codigo = _codigo;
        this.descripcion = _descripcion;
        this.stock = _stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
}
