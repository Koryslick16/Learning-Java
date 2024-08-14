package org.aptech.OOP;

//ABSTRACTION
import java.util.List;

//yet to be implented, creating logic for it
public interface IBank {
//    by default, they are all public methods
    String addCustomer();
    void displayCustomer(long id);
    String deleteCustomer(long id);
    void displayAll();
    Bank updateCustomer (Bank bank, long id);

}
