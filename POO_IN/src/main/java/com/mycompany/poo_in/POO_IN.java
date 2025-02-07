package com.mycompany.poo_in;

import java.util.Scanner;

public class POO_IN {
    
    public static void main(String[] args) {
        //int num;
        //double numd, numd2;
       // String text;
        //boolean bool = false;
        //int arregloentero [] = new int[5];
        //int arrentero[] = {5,6,7,5,5};
        //int arrmat[][] = new int [2][2];
        //int arrmat2 [][] = {{3,3},{2,2}};
        //String arrT [] = new String[5];
        //String arrt [] = {"pepe", "juan"};
        /*
        for (int i = 0; i <= 10; i++) {
            //System.out.println(i);
            if (i % 2 == 0) {
                System.out.println(i);
            }
            for (int j = 0; j < 10; j+=4) {
                System.out.println(j);
            }
        }*/
        
        
        /*
        int i = 0;
        while(true){
            System.out.println(i);
            i++;
            if (i == 5) {
                System.out.println("adios");
                break;
            }
        }
        */
        
        Scanner sc = new Scanner(System.in);
        //String op = sc.nextLine();
        /*
        System.out.println("Ingrese una palabra:\t");
        String op = sc.nextLine();
        switch(op){
            case "hola":
                System.out.println("Hola");
                break;
            case "patata":
                System.out.println("Patata");
                break;
        }
        */
        operaciones op = new operaciones();
        System.out.println("Ingrese un numero de mes del 1 al 2");
        op.setMes(sc.nextInt());
        
        /*
        int mes = op.getMes();
        switch(mes){
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
        }
        */
        //op.mesIngresado();
    }
    
}
