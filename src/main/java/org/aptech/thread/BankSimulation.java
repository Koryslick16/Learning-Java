package org.aptech.thread;

public class BankSimulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(123456, 10000);
        BankOperate operate = new BankOperations(account);

        Thread customer1 = new Thread(() -> operate.withdrawMoney(5000), "Korede");
        Thread customer2 = new Thread(() -> operate.withdrawMoney(4000), "Stephanie");
        Thread customer3 = new Thread(() -> operate.withdrawMoney(3500), "Alex");
        Thread customer4 = new Thread(() -> operate.withdrawMoney(1200), "Crysta");

        customer1.start();
        customer2.start();
        customer3.start();
        customer4.start();

        try{
            customer1.join();
            customer2.join();
            customer3.join();
            customer4.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
