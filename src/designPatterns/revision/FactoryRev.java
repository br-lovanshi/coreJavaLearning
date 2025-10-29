package designPatterns.revision;

import projects.ecommerce.exception.NotFoundException;

interface Payment{
    void Pay();
}

class CreditCard implements Payment{

    @Override
    public void Pay() {
        System.out.println("Credit cart payment");
    }
}

class Upi implements Payment{

    @Override
    public void Pay() {
        System.out.println("Upi payment");
    }
}

class PaymentFactory{
    public static Payment getPaymentMethod(String type){
        if("cc".equalsIgnoreCase(type)){
            return new CreditCard();
        }else if("upi".equalsIgnoreCase(type)){
            return new Upi();
        }else{
            throw new NotFoundException("Not appropriate payment method found.");
        }
    }
}
public class FactoryRev {
    public static void main(String[] args) {
        Payment payment = PaymentFactory.getPaymentMethod("cc");
        payment.Pay();
    }
}
