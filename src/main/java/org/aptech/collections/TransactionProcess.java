package org.aptech.collections;

import java.util.ArrayList;
import java.util.List;

public class TransactionProcess {
    List<Transact> transactions = new ArrayList<>();

    public TransactionProcess() {

    }

    public void addTransaction(Transact transact){
        transactions.add(transact);
    }
    public void allTransaction(){
        for (Transact bt : transactions){
            System.out.println(bt);
        }
    }
}
