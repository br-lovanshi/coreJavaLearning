package oops_revision.oppsLld;

interface PaymentGateway{
    void initiatePayment(double amt);
    default void payment(){
        System.out.println("Payment gateway service");
    }
    int ID = 30;
    String SERVICE_NAME = "PAYMENT_GATEWAY";
}

class RazorPay implements PaymentGateway{

    @Override
    public void initiatePayment(double amt) {
        System.out.println("Paying via Razorpay");
    }
}

class Stripe implements PaymentGateway{

    @Override
    public void initiatePayment(double amt) {
        System.out.println("Paying via Stripe");
    }
}

class CheckoutService{
    private PaymentGateway paymentGateway;
    public CheckoutService(PaymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
    }

    public void checkout(double amt){
        System.out.println("Payment gateway id " + paymentGateway.ID);
        System.out.println("Payment gateway service name " + paymentGateway.SERVICE_NAME);
        this.paymentGateway.initiatePayment(amt);
    }
}

public class InterfaceLld {
    public static void main(String[] args) {
        PaymentGateway paymentGateway = new RazorPay();
        paymentGateway.payment();
        CheckoutService checkoutService = new CheckoutService(paymentGateway);
        checkoutService.checkout(1000);
    }
}

/* Interface is a contract, use to make loosely coupled applications.
 * Can achieve 100 inheritance.
 * Only have abstract methods.
 * Java 8 onboards have default fields.
 *
 *
 * AI/Automation + Skilled Person - Many works will be managed by him : Less job, no demand of mediocre.
 * Coding
 * AI/Automation
 * System
 * Communication
 * Logical thinking
 * Problem solving
 *
 * */