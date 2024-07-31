package org.aptech.OOP;
//INHERITANCE
//DYNAMIC INPUT
//CHILD CLASS
//RUNTIME POLYMORPHISM
public class CreditCard extends Payment{

    @Override
    public void payOut(){
        System.out.println("Total Pay Out amount for Credit Card is: " + amount);
    }
}
