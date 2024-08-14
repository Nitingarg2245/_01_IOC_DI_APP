package com.nitin.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
        //jaisi hi upar wali line run hogi spring sari bean defination ko read karke unke objects bna dega jha pe
        // dependency injection chaiye wo de dega

        Car car=ac.getBean(Car.class);//ye object to IOC conatiner ke pas pda hi hua hai hmm bs wha se leke use kar lenge
        car.drive();

    }
}
