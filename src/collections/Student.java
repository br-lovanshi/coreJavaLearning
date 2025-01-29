package collections;

public class Student {
    private String name;
    private int age;
    private boolean isPassed;

    public Student(){};

    public Student(String name, int age, boolean isPassed){
        this.name = name;
        this.age = age;
        this.isPassed = isPassed;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public boolean getIsPass(){
        return this.isPassed;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isPassed=" + isPassed +
                '}';
    }
}
