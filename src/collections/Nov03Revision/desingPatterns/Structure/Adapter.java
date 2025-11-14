package collections.Nov03Revision.desingPatterns.creational;


class LegacySystem{
    public void transactionExecutor(double amount){
        System.out.println("Amount " + amount);
    }
}

interface PaymentGateway{
    void processPayment(double amount);
}

class LegacyAdapter implements PaymentGateway{

    private LegacySystem legacySystem;

    LegacyAdapter(LegacySystem legacySystem){
        this.legacySystem = legacySystem;
    }

    @Override
    public void processPayment(double amount) {
        legacySystem.transactionExecutor(amount);
    }
}

public class Adapter {
    public static void main(String[] args) {
        PaymentGateway paymentGateway = new LegacyAdapter(new LegacySystem());
        paymentGateway.processPayment(3000);
    }
}


// Used when older legacy code implement a library but its interface cant be change
