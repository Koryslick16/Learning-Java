package org.aptech.OOP;
//implementation

import java.util.List;

public class BankImp implements IBank {
    Bank[] addUser = new Bank[3];
    @Override
    public String addCustomer() {
        Bank bank = new Bank();
        bank.setAccountNo("1233992222");
        bank.setBalance(100.0);
        bank.setFirstName("Sochima");
        bank.setLastName("Korede");

        Bank bank1 = new Bank();
        bank1.setAccountNo("00022333444");
        bank1.setFirstName("Inala");
        bank1.setLastName("Jacob");
        bank1.setBalance(12000);

        Bank bank2 = new Bank();
        bank2.setAccountNo("00022555444");
        bank2.setFirstName("Bridget");
        bank2.setLastName("Larsen");
        bank2.setBalance(13000);

        addUser[0] = new Bank(bank.getAccountNo(), bank.getFirstName(), bank.getLastName(), bank.getBalance());
        addUser[1] = new Bank(bank1.getAccountNo(), bank1.getFirstName(), bank1.getLastName(), bank1.getBalance());
        addUser[2] = new Bank(bank2.getAccountNo(), bank2.getFirstName(), bank2.getLastName(), bank2.getBalance());
        return addUser.length+ " customers registered succesfully";
    }

    @Override
    public void displayCustomer(long id) {

    }

    @Override
    public String deleteCustomer(long id) {
        return "";
    }

    @Override
//    public List<Bank> displayAll() {
//        return List.of();
//    }
    public void displayAll(){
        Bank bank = new Bank();
        for (Bank bk : addUser)
            System.out.println(bk.toString());
    }

    @Override
    public Bank updateCustomer(Bank bank, long id) {
        return null;
    }
}
