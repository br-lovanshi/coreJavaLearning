package classRelationship;

import java.util.Arrays;
import java.util.List;

class Teacher{
    private String name;
    private List<Student> studentList;

    Teacher(String name, List<Student> studentList){
        this.name = name;
        this.studentList = studentList;
    }

//    @Override
//    public String toString() {
//        return "Teacher{" +
//                "name='" + name + '\'' +
//                ", studentList=" + studentList +
//                '}';
//    }
}

class Student{
    private String name;
    private int rollNumber;
    private Teacher teacher;

    Student(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }
    public void setTeacher(Teacher teacher){
        this.teacher = teacher;
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", rollNumber=" + rollNumber +
//                ", teacher=" + teacher +
//                '}';
//    }
}

public class Associations {
    public static void main(String[] args) {
        // has a relationship
        Student student = new Student("Ram", 200);
        Student student1 = new Student("Shyam", 10);

        Teacher teacher = new Teacher("Hari", Arrays.asList(student1, student));
        student1.setTeacher(teacher);

        System.out.println(teacher);
        System.out.println(student1);
    }
}

/** Teacher has a student, students teaches via teacher * ,
 *  Student both can exist without each other.
 */


/**
 * Core Java
 * DSA
 * Spring Boot
 * Microservices
 * Design Patterns/SOLID
 * CI/CD
 * Kubernates
 */