package oops;

class Person{
    private String name;

    public Person(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
    Person person = new Person("Ram");
    String name = person.getName();
    System.out.println(name);
    }
}
