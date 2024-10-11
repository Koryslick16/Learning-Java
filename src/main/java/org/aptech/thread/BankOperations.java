package org.aptech.thread;

public class BankOperations implements BankOperate{
    private BankAccount bankAccount;

    public BankOperations(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void withdrawMoney(double amount) {
        bankAccount.withdrawal(amount);
    }
}
