package org.aptech.OOP;
//INHERITANCE
//DYNAMIC INPUT
//CHILD CLASS
//RUNTIME POLYMORPHISM
public class PayStack extends Payment{

    @Override
    public void payOut(){
        System.out.println("Total Pay Out amount for PayStack is: " + amount);
    }
}
