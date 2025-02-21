package oops;

class Animal {

    public void eat() {
        System.out.println("Animal eat");
    }
}

class Dog extends Animal {

    public void behavior() {
        System.out.println("Dog bark");
    }
}

public class Inheritance {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Animal dog = new Dog();
        dog.eat();

        Dog dog1 = new Dog();
        dog1.behavior();
        dog1.eat();
    }
}
