package collections.Nov03Revision.desingPatterns.behaviour;

interface PaymentStrategy{
    void pay(double amt);
}

class UpiStrategy implements PaymentStrategy{

    public void pay(double amt){
        System.out.println("Pay via upi " + amt);
    }
}

class CardStrategy implements PaymentStrategy{
    @Override
    public void pay(double amt){
        System.out.println("Pay via card " + amt);
    }
}


class PaymentService{
    private PaymentStrategy paymentStrategy;

    PaymentService(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void makePayment(double amt){
        paymentStrategy.pay(amt);
    }
}
public class Strategy {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService(new CardStrategy());
        paymentService.makePayment(48484.3);
    }
}


// remove hard coded if else condition and let code decide at runtime which strategy to call