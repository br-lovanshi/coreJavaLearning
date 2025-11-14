package collections.Nov03Revision.solid;

interface Payment{
    void pay();
}
class Upi implements Payment{

    @Override
    public void pay() {
        System.out.println("UPI");
    }
}

class CreditCard implements Payment{

    @Override
    public void pay() {
        System.out.println("Credit Card");
    }
}

class PaymentMethod {
    void payable(Payment payment){
        if(payment instanceof Upi){
            payment.pay();
        }if(payment instanceof CreditCard){
            payment.pay();
        }
    }
}

public class OCP {

    public static void main(String[] args) {
        PaymentMethod paymentMethod = new PaymentMethod();
        paymentMethod.payable(new CreditCard());
        paymentMethod.payable(new Upi());
    }
}
