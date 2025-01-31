package com.mycompany.poo_in;
public class aritmetica {
    int num1, num2;
    String texto1;
    
    public aritmetica(){
    }
    public aritmetica(int num1){
        this.num1 = num1;
    }
    public aritmetica(int num1, String texto){
        this.num1 = num1;
        this.texto1 = texto;
    }
    public void setNum1(int num1){
        this.num1 = num1;
    }
    public void setNum2(int num2){
        this.num2 = num2;
    }
    public int getNum1(){
        return this.num1;
    }
    public int getNum2(){
        return this.num2;
    }
    public void suma(){
        System.out.println("La suma de los numeros: " 
        +this.num1 + " + " + this.num2 + " = "
        + (this.num1 + this.num2));
    }
}
