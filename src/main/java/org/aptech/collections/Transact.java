package org.aptech.collections;

import org.aptech.enums.Transaction;

public class Transact {
    private String transId;
    private Transaction status;
    private double amount;

    public Transact(String transId, Transaction status, double amount) {
        this.transId = transId;
        this.status = status;
        this.amount = amount;
    }

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Transaction getStatus() {
        return status;
    }

    public void setStatus(Transaction status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Transact{" +
                "transId='" + transId + '\'' +
                ", status=" + status +
                ", amount=" + amount +
                '}';
    }
}
