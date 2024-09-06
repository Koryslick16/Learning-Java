package org.aptech.collections;

import org.aptech.enums.Transaction;

public class TransactMain {
    public static void main(String[] args) {
        Transact bk1 = new Transact("N55Tok21", Transaction.PENDING, 80000);
        Transact bk2 = new Transact("N55T9k31", Transaction.SUCCESSFUL, 30800);
        Transact bk3 = new Transact("N55Tok21", Transaction.PENDING, 80000);
        Transact bk4 = new Transact("N55Tok21", Transaction.FAILED, 80000);

        TransactionProcess tp = new TransactionProcess();
        tp.addTransaction(bk1);
        tp.addTransaction(bk2);
        tp.addTransaction(bk3);
        tp.addTransaction(bk4);
    }
}
