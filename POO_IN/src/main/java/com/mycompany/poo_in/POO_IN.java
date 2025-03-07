package com.mycompany.poo_in;
public class POO_IN {
    public interface carro{
        public void arrancar();
        public void acelerar(int velocidad);
        public void frenar();
    }
    
    public static class perro implements carro{
        public String nombre;
        public int edad;
        public perro(){
            
        }
        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        public String getNombre(){
            return this.nombre;
        }
        public void setEdad(int edad){
            this.edad = edad;
        }
        public int getEdad(){
            return this.edad;
        }

        @Override
        public void arrancar() {
            System.out.println("El perro arranco");
        }

        @Override
        public void acelerar(int velocidad) {
            System.out.println("El perro acelero a: " + velocidad +" km/h");
        }

        @Override
        public void frenar() {
            this.edad *= 25;
        }
    }
    
    public static void main(String[] args) {
        gato gato = new gato();
        gato.setNombre();
        gato.mostrarNombre();
        /*
        perro p = new perro();
        p.arrancar();
        p.acelerar(15);
        */  
    }
}