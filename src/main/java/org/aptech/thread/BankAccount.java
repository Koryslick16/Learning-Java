package org.aptech.thread;

public class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double withdrawal) {
        this.accountNumber = accountNumber;
        this.balance = withdrawal;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public synchronized boolean withdrawal(double amount){
        if (balance >= amount){
            balance -= amount;
            System.out.println("\n" +Thread.currentThread().getName()+ " withdrawal " + amount + ".\nRemaining balance: "+ balance);
            return true;
        }
        else {
            System.out.println("\n" +Thread.currentThread().getName() + " tried to withdraw " + amount + ".\nInsufficient funds");
            return false;
        }
    }
}
