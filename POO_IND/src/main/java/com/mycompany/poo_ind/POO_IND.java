package com.mycompany.poo_ind;
import java.util.ArrayList;

public class POO_IND {
    public static void main(String[] args) {
        ArrayList <String> lista = new ArrayList <String>();
        lista.add("Manzana");
        lista.add("Tomate");
        lista.add("Jamon");
        System.out.println("Los datos de las lista son: " + lista);
        String d_Lista = lista.get(0);
        System.out.println("El primer dato de la lista es: " + d_Lista +
                "El tamano de la lista es: " + lista.size());
        lista.remove("Tomate");
        System.out.println("La nueva lista tiene: " + lista+"\n");
        for(String elemento : lista){
            System.out.println(elemento);
        }
    }
}
