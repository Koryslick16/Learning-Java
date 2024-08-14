package org.aptech.OOP;

//ABSTRACTION

public class BankMain {
    public static void main(String[] args) {
        BankImp banklogic = new BankImp();
        System.out.println(banklogic.addCustomer());
        banklogic.displayAll();

    }

}
