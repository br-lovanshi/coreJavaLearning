package solid_principle;

abstract class FlyingBirds extends Bird{
    abstract void fly();
}

abstract class Bird{
    abstract void eat();
}

class Sparrow extends FlyingBirds{
    @Override
    void eat() {
        System.out.println("Sparrow eating...");
    }

    @Override
    void fly() {
        System.out.println("Sparrow flying..");
    }
}

class Ostrich extends Bird{
    @Override
    void eat() {
        System.out.println("Ostrich eating..");
    }
}



public class LiskovSbtitutionPrinciple {
    public static void main(String[] args) {

    }
}
//problem
class Bird1 {
    void fly() {
        System.out.println("Flying");
    }
}

class Penguin extends Bird1 {
    // Penguins can't fly!
    @Override
    void fly() {
        throw new UnsupportedOperationException("Penguins can't fly");
    }
}


// subclass should work the same as parent without code changes if we use subclass