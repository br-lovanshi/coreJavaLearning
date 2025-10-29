package oops.abstraction;

public interface PaymentGateway {
    void pay(double amount);
}

abstract class UpiPayment implements PaymentGateway{
    void authentication(){
        System.out.println("Authenticating...");
    }
}

class GPay extends UpiPayment{
   @Override
    public void pay(double amount) {
        authentication();
        System.out.println("Paid rs + " + amount);
    }

    public static void main(String[] args) {
        GPay gpay = new GPay();
        gpay.pay(500.5);
    }
}