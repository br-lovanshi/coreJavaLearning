package designPatterns;

class Student{
    private int num = 1;
    private int id = num++;
    private String name;
    private int age;
    private boolean isPassed;


    private Student(StBuilder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.isPassed = builder.isPassed;
    }
    public static class StBuilder{
         private String name;
         private int age;
         private boolean isPassed;

        public StBuilder setName(String name) {
            this.name = name;
            return this;

        }

        public StBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StBuilder setPassed(boolean passed) {
            isPassed = passed;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isPassed=" + isPassed +
                '}';
    }
}
 public class Builder {
    public static void main(String[] args) {
        Student student =  new Student.StBuilder().setAge(20).setName("Ram").setPassed(true).build();
        Student student1 =  new Student.StBuilder().setAge(21).setName("Shyam").setPassed(true).build();
        System.out.println(student.toString());
        System.out.println(student1.toString());
    }
}
