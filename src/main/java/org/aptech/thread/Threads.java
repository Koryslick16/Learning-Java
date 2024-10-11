package org.aptech.thread;

public class Threads extends Thread {
    public int number;
    public Threads(int number){
        this.number = number;
    }

    @Override
    public void run(){
        for (int i=1; i<=5; i++){
            System.out.println(i+ " New Thread " + number);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Mains {
    public static void main(String[] args) {
        Threads thread = new Threads(1);
        Threads thread2 = new Threads(2);
        thread.start();
        thread2.start();
    }
}