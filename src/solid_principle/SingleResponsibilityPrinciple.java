package solid_principle;
abstract class InvoiceCalculation{
    abstract void calculation();
}

abstract class persistence{
    abstract void persistInvoice();
}
abstract class Printer{
    abstract void printInvoice();
}

public class SingleResponsibilityPrinciple {
    public static void main(String[] args) {
    Printer printer = new Printer() {
        @Override
        void printInvoice() {
            System.out.print("Printing");
        }
    };
    printer.printInvoice();
    }
}
