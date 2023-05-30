package Herencia.Animal;


public class Animal {
// @definir como atributos el nombre, alimento, edad y raza del Animal.
public String nombre;
public String alimento;
public int edad;
public String raza;

//declarar un constructor que inicialice los atributos de la clase.
public Animal(String nombre, String alimento, int edad, String raza){
    this.nombre = nombre;
    this.alimento = alimento;
    this.edad = edad;
    this.raza = raza;
}

// mostrar luego un mensaje por pantalla informando de que se alimenta.
public void alimentarse(){
    System.out.println("El animal se alimenta de" + alimento);}
}