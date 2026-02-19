package oops_revision.oppsLld;

// compile time
class Calculator{
    int sum(int a, int b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }

    void sum(String a, int b, int c) {
    }

    double sum(double a, double b){
        return a + b;
    }
}

class Vehicle{
    void engin(){}
    void type(){}
    void speed(){}
}

class Cars extends Vehicle{
    @Override
    public void engin(){
        System.out.println("Diesel engin");
    }

    public void start(){}
}

public class PolymorphismLld {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum(1,4);
        calculator.sum(3.3, 4.2);


        // runtime polymorphism
        Cars cars = new Cars();
        cars.engin();
    }
}
