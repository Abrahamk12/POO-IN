package com.mycompany.poo_in;
import javax.swing.JOptionPane;

public class gato implements avion{
    private String nombre, raza, color;
    private int edad, tamaño, peso;
    
    public gato(){}
    
    public void setNombre(){
        this.nombre = JOptionPane.showInputDialog(null, "¿Cómo se llamae el gato?");
    }
    
    public void mostrarNombre(){
        JOptionPane.showMessageDialog(null,"El gato se llama: "+this.nombre);
    }
    
    @Override
    public void volar() {
        System.out.println("El gato volo");
    }
}
