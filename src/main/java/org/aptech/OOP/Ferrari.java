package org.aptech.OOP;

//Abstract child class
//interface implements
public class Ferrari extends Car {
    @Override
    public String acceleration(int currentSpeed){
        if(currentSpeed > 180)
            return "You are on very high speed. Remember, Speed Kills.";
        return "Normal Speed";
    }

    @Override
    public void drive() {
        System.out.println("Drive Ferrari and see how cool it is.");
    }
}
// curly brace in if is used to wrap several statements