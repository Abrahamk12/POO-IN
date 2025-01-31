package com.mycompany.poo_in;
public class POO_IN {
    public static void main(String[] args) {
        aritmetica aritmetica = new aritmetica();
        aritmetica.setNum1(2);
        aritmetica.setNum2(5);
        System.out.println("num1: " + aritmetica.getNum1() + "\nnum2: " 
        + aritmetica.getNum2());
        aritmetica.suma();
        
    }
}
