package collections.Nov03Revision.solid;

class CC implements Payment{

    @Override
    public void pay() {
        System.out.println("Paying via card");
    }
}

class Neft implements Payment{

    @Override
    public void pay() {
        System.out.println("NEFT Bank Transer");
    }
}



public class DIP {

    public static void main(String[] args) {
        Payment cc = new CreditCard();
        cc.pay();
        Payment neft = new Neft();
        neft.pay();
        Payment upi = new Upi();
        upi.pay();
    }
}
