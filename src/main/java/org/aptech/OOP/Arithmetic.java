package org.aptech.OOP;
// POLYMORPHISM
// COMPILE TIME POLYMORPHISM
public class Arithmetic {
    public int add(int a, int b){
        return a + b;
    }

    public int add(int a, int b, int c){
        return  a + b + c;
    }

    public double add(double a, double b){
        return a + b;
    }

    public double add(double a, double b, double c){
        return  a + b + c;
    }

    public double add(int a, int b, double c, double d){
        return  a + b + c + d;
    }

}
