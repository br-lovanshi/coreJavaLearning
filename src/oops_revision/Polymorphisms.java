package oops_revision;

public class Polymorphisms {
    // compile time polymorphism
    public int sum(int a, int b){
        return a + b;
    }

    public int sum(int a, int b, int c){
        return a + b + c;
    }

    public int sum(double a, double b){
        return  (int)a + (int)b;
    }

    // runtime polymorphism
    public void calculate(){
        System.out.println("Calculate");
    }


}


class Maths{
    public static void main(String[] args) {
        Polymorphisms polymorphisms = new Polymorphisms();
        polymorphisms.sum(3,2);
        polymorphisms.sum(1,99,4);
    }
}