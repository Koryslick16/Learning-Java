package org.aptech.thread;

public class OrderFood extends Thread{
    private String orderName;

    public OrderFood(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public void run() {
        try{
            System.out.println(orderName + " is being prepared.");
            Thread.sleep(5000);
            System.out.println("\tYour " + orderName + " is ready");
        }catch (InterruptedException e){
            System.out.println(orderName + " preparation was interrupted");
        }
    }
}


class MainShii{
    public static void main(String[] args) {
      OrderFood orders = new OrderFood("Beans");
      OrderFood order2 = new OrderFood("Pasta");
      OrderFood order3 = new OrderFood("Pizza");
      OrderFood order4 = new OrderFood("Burger");

      orders.run();
      order2.run();
      order3.run();
      order4.run();

      try {
          orders.join();
          order2.join();
          order3.join();
          order4.join();
      } catch (InterruptedException e) {
          System.out.println(" Order processing was interrupted");;
      }
    }
}


