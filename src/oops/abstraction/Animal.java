package oops.abstraction;

public abstract class Animal {
    String name;
    abstract void sound();
    void feed(){
        System.out.println("Animal eat");
    }
}

class Horse extends Animal{

    public void print(String name){
        super.name = name;
        System.out.println("Hello " + super.name);
    }

    @Override
    void sound() {
        System.out.println("Make noise...");
    }
}

class Cow implements Animal1{

    @Override
    public void sound() {
        System.out.println("Cow making sound..");
    }

    @Override
    public void print() {
        System.out.println("Cow is respectful");
    }
}

class Main{
    public static void main(String[] args) {
        Animal animal = new Horse();
        animal.feed();
//        animal.print("Chetak");
        animal.sound();

        Animal1 animal1 = new Cow();
        animal1.print();
    }
}

interface Animal1{
    void sound();
    String name = "";
      default void print(){
          System.out.println("Hello world");
          System.out.println("Hello world");
          System.out.println("Hello world");
          System.out.println("Hello world");
          System.out.println("Hello world");
    }
}