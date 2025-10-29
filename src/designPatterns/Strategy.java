package designPatterns;

interface PaymentStrategy{
    void pay(double amt);
}

class Upi implements PaymentStrategy{

    @Override
    public void pay(double amt) {
        System.out.println("Paying " + amt + " via upi.");
    }
}
class DebitCard implements PaymentStrategy{

    @Override
    public void pay(double amt) {
        System.out.println("Paying " + amt + " via debit card.");
    }
}
class CreditCard implements PaymentStrategy{

    @Override
    public void pay(double amt) {
        System.out.println("Paying " + amt + " via credit card.");
    }
}

class ShoppingCard{
    PaymentStrategy paymentStrategy;
    void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    void checkout(double amt){
        paymentStrategy.pay(amt);
    }
}
public class Strategy {
    public static void main(String[] args) {
        ShoppingCard shopping = new ShoppingCard();
        shopping.setPaymentStrategy(new Upi());
        shopping.checkout(500);

        shopping.setPaymentStrategy(new DebitCard());
        shopping.checkout(10000);

        shopping.setPaymentStrategy(new CreditCard());
        shopping.checkout(3000);
    }
}
/*** Define which algorithms needs to call at runtime.
 Useful when :-
            - We have multiple way to implement the same scenarios
            - We don't want to write multiple if else or switch cases
            - At runtime want to decide which class need to call
            - We want to implement open/close principle.
***/