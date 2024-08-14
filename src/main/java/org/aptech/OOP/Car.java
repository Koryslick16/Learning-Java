package org.aptech.OOP;

// ABSTRACT CLASS
// abstract method must be in an abstract class
public abstract class Car {

    public void drive(){
        System.out.println("Vehicle can either be manual or automatic transmission");
    }

    public abstract String acceleration(int currentSpeed);
}
