package com.nitin.beans;

public class ElectricEngine implements Engine{
   @Override
    public void start() {
       System.out.println("electric engine started");
    }
    //jaisi hi application context start hoga wo sari bean classes read karke unke object
    // bna dega tab ye chlega just to show how things work internally
    public  ElectricEngine(){
        System.out.println("electric engine constructor called ");
    }
}
