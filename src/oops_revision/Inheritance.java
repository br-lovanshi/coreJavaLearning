package oops_revision;

class Animal{

    public void makeNoise(){
        System.out.println("Animal makes sound");
    }

    public void eat(){
        System.out.println("Eat");
    }

    public void hunt(){
        System.out.println("Hunting");
    }
}

class Dog extends Animal{

    public void makeNoise(){
        System.out.println("Barking.. bouwwwuuu...");
    }

//    public void eat(){
//        System.out.println("Eat bons, biscuits, meet");
//    }
}
public class Inheritance {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.makeNoise();

        Dog dog = new Dog();
        dog.eat();
        dog.hunt();
        dog.makeNoise();
    }
}
