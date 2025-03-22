package basic;

public class ImmutableClass {
    private final String name;

    ImmutableClass(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}

/*
* How to make immutable object
* - mark it as private final
* - Keep only getter method in class
*/