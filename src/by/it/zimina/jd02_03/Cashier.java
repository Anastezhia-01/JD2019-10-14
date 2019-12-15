package by.it.zimina.jd02_03;

public class Cashier implements Runnable{

    private String name;

    public Cashier(int number){
        name="Cashier # "+number;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void run() {
        System.out.println(this+" cashier open");
        Buyer b;
        while ((b= QueueBuyer.extractBuyer())!=null) {
            System.out.println(this + " service " + b);
            Helper.sleep(Helper.random(2000, 5000));
            System.out.println(b+" bought "+b.goodsInBacket);
            System.out.println(b + " total price " + b.getTotalPrice()+"$");
            System.out.println(this + "service for " + b + " finished");
            synchronized (b) {
                b.notify();
            }
        }
        System.out.println(this+" cashier closed");
    }
}
