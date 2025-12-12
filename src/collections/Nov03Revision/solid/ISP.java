package collections.Nov03Revision.solid;


interface Eatable {
    void eat();
}

interface Workable {
    void work();
}


class Human implements Eatable, Workable {

    @Override
    public void eat() {

    }

    @Override
    public void work() {

    }
}

class Robot implements Workable {

    @Override
    public void work() {

    }
}

public class ISP {
    public static void main(String[] args) {
        Human ram = new Human();
        ram.eat();
        ram.work();
        Robot ai = new Robot();
        ai.work();
    }
}

// You cant force to implement a class/interface which is not in used. Create a seprate interfaces is better than one common interface