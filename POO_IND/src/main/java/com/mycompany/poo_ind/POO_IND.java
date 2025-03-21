package com.mycompany.poo_ind;
import java.util.HashSet;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class POO_IND {
    public static void metodoLinkedList(){
        LinkedList<String> lista = new LinkedList<>();
        String datos = "";
        lista.add("Hola");
        lista.add("Mundo");

        //Añadir cosas al incio de la lista
        lista.addFirst("Inicio");
        //Añadir cosas al final de la lista
        lista.addLast("Fin");

        System.out.println("Lista: " + lista);
        for(String elemento : lista){
            System.out.println("Elemento: " + elemento);
            datos += ", " + elemento;
        }
        JOptionPane.showMessageDialog(null, datos);

    }
    public static void metodoHashSet(){
        HashSet<String> lista = new HashSet<>();
        String datos = "";
        lista.add("Elemento hashset 1");
        lista.add("Patata");

        System.out.println("Lista: " + lista);
        for(String elemento : lista){
            System.out.println("Elemento: " + elemento);
            datos += ", " + elemento;
        }
        JOptionPane.showMessageDialog(null, datos);
    }
    public static void main(String[] args) {
        System.out.println("LinkedList");
        metodoLinkedList();
        System.out.println("------------------------------------");
        System.out.println("HashSet");
        metodoHashSet();
    }
}
