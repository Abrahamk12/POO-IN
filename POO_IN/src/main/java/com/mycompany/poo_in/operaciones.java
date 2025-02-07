package com.mycompany.poo_in;
public class operaciones {
    int mes, dia;
    public operaciones(){
        
    }
    void setMes(int mes){
        this.mes = mes;
        mesIngresado();
    }
    int getMes(){
        return mes;
    }
    private void mesIngresado(){
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
