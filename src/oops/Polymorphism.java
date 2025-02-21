package oops;

class CompileTimePolymorphism{

    void sum(int a, int b){
        System.out.println(a + b);
    }

    void sum(int a, int b, int c){
        System.out.println(a + b + c);
    }

    double sum(double a, double b){
        return a + b;
    }
}

class RuntimePolymorphism extends Animal{

    @Override
    public void eat(){
        System.out.println("Runtime polymorphism: Animal eat");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
    CompileTimePolymorphism compileTimePolymorphism = new CompileTimePolymorphism();
    compileTimePolymorphism.sum(3.2, 4.2);
    compileTimePolymorphism.sum(2,2);
    compileTimePolymorphism.sum(1,4,5);

    RuntimePolymorphism runtimePolymorphism = new RuntimePolymorphism();
    runtimePolymorphism.eat();
    }
}
