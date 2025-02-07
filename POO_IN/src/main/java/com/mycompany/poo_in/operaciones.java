package com.mycompany.poo_in;
public class operaciones {
    int mes, dia;
    public operaciones(){
        
    }
    public void setMes(int mes){
        this.mes = mes;
        //mesIngresado();
    }
    public int getMes(){
        return mes;
    }
    public void mesIngresado(){
        switch(this.mes){
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
        }
    }
}
