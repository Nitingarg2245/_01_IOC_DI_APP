package com.nitin.beans;

public class Car {
    private Engine engine;
    //jaisi hi application context start hoga wo sari bean classes read karke unke object
    // bna dega tab ye chlega just to show how things work internally
    public Car(){
        System.out.println(" car class constructor is called");
    }
    //to application context object bnake setter method ko call krega apne aap and usme required
    // object ko pass karega (yha pe electric engine ka object)
    public void setEngine(Engine engine){
        this.engine=engine;
    }

    public void drive(){
        engine.start();
        System.out.println("car is being driven");
    }
}
