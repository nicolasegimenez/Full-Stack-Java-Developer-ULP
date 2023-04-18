/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

/**
 *
 * @author nicoarkano
 */
public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private int edicion;
    
//String va con mayuscula    
    public Libro (String _isbn, String _titulo, String _autor, int _edicion) {
        this.isbn = _isbn;
        this.titulo = _titulo;
        this.autor = _autor;
        this.edicion = _edicion;
}
    
    public String getIsbn(){
    return isbn;
            }
    public String getTitulo(){
    return titulo;
    }
    
   public String getAutor(){
   return autor;
   }
   
   public int getEdicion() {
   return edicion;
   
   }
   
   public void setTitulo(String _titulo){
   this.titulo = _titulo;
   }
   public void setAutor(String _autor) {
   this.autor = _autor;
   
   }
   
   public void setEdicion(int _edicion) {
   this.edicion = _edicion;
     }
}
 