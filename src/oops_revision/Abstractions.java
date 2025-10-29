package oops_revision;

public abstract class Abstractions {
    abstract void greet();
}

class Abstraction1 extends Abstractions{

    @Override
     void greet(){
        System.out.println("Hello world");
     }
}

class Abstraction2 extends Abstractions{
    @Override
    void greet(){
        System.out.println("Namaste world!");
    }
}

interface Pen{
    void info();
}

class GelPen implements Pen{
    @Override
    public void info(){
        System.out.println("Gel pen");
    }
}

class BallPen implements Pen{

    public void info(){
        System.out.println("Ball pen");
    }
}

class main{
    public static void main(String[] args) {

        // abstract class
        Abstractions abstractions = new Abstraction1();
        abstractions.greet();

        Abstractions abstractions2 = new Abstraction2();
        abstractions2.greet();

        // interface
        Pen gel = new GelPen();
        gel.info();

        Pen ball = new BallPen();
        ball.info();
    }
}

/***
 * Abstraction: Hiding the internal implementation or mechanism of class and only show the method signature to reduce the complexity.
 * Example: When while driving you press the break call will stop, you don't know about the internal mechanism about it.
 */
