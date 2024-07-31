package org.aptech.OOP;

// ENCAPSULATION
public class Order {
    private String[] items;
    private int orderId;
    private double prices;
    private int qty;


    public Order(String[] items, int orderId, double prices, int qty) {
        this.items = items;
        this.orderId = orderId;
        this.prices = prices;
        this.qty = qty;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public double getPrices() {
        return prices;
    }

    public void setPrices(double prices) {
        this.prices = prices;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
