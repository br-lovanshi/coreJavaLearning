package solid_principle;

interface Worker{
    void eat(); // not all worker can eat
    void work();
}

class Human implements Worker{

    public void eat(){
        System.out.println("Human eat");
    }

    public void work(){
        System.out.println("Working..");
    }
}

class AI implements Worker{
    public void eat(){
        System.out.println("Can't eat");
    }
    public void work(){
        System.out.println("Working...");
    }
}

interface Workable{
    void work();
}
interface Eatable{
    void eat();
}
class Humans implements Workable, Eatable{
    @Override
    public void work() {

    }

    @Override
    public void eat() {

    }
}

class Robot implements Workable{
    @Override
    public void work() {

    }
}
public class InterfaceSegregation {
    public static void main(String[] args) {

    }
}

// Don't force a class to implement methods it doesn't use.