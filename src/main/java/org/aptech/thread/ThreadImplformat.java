package org.aptech.thread;

public class ThreadImplformat implements Runnable {
    public int number;
    public ThreadImplformat(int number){
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

class Main{
    public static void main(String[] args) {
        ThreadImplformat thread = new ThreadImplformat(1);
        ThreadImplformat thread2 = new ThreadImplformat(2);
        thread.run();
        thread2.run();
    }
}
