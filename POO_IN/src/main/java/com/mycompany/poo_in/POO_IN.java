package com.mycompany.poo_in;


public class POO_IN {

    public static void main(String[] args) {
        /*
        int numero = 5;
        double numero2 = 1.5;
        boolean dato = false;
        String texto = "";
        */
        int arreglo[] = {5, 1, 8, 3, 2, 20, 15};
        int arreglo2[] = new int[arreglo.length];
        //arreglo[5] = 1;
        //System.out.println(arreglo[5]);
        int mayor = 0, pos = 0;
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                if(mayor < arreglo[j]){
                    mayor = arreglo[j];
                    pos = j;
                }
            }
            arreglo2[i] = mayor;
            arreglo[pos] = 0;
            mayor = 0;
            System.out.println(arreglo2[i]);
        }
        System.out.println("-------------------------------------------");
        int con = 0;
        for (int i = arreglo.length -1; i >= 0; i--) {
            arreglo[con] = arreglo2[i];
            System.out.println(arreglo[con]);
            con++;
        }
        
        int arreglo3[][] = new int [3][2];
    }
}
