package com.mycompany.poo_ind;
public class Gato implements Avion{
    String nombre, raza, genero;
    double edad;
    public Gato(String nombre){this.nombre = nombre;}
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setEdad(double edad){
        this.edad = edad;
    }
    public double getEdad(){
        return this.edad;
    }
    
    public void numPar(){
        double num, num2 = 2, num3 = 3;
        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0){
                System.out.println("El numero: " + i + " es par");
            }
        }
        num = num2 + num3;
        System.out.println("la suma de num1 y num2 = " + num);
 
    }
    
    @Override
    public void volar() {
        System.out.println("El gato esta volando");
    }

    @Override
    public void planear() {
        System.out.println("El gato esta planeando");
    }
    
}