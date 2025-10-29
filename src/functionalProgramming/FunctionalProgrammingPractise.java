package functionalProgramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface Print<T>{ // Using generic
    void print(T t);
}
public class FunctionalProgrammingPractise {
    public static void main(String[] args) {
        Student st = new Student(101, "Ram", 9000);
        Print<Student> studentPrint = student -> {
            System.out.println("Name "+ student.getName());
            System.out.println("Roll Num "+ student.getRoll());
            System.out.println("Score "+ student.getScore());
        };

        studentPrint.print(st);

        List<Student> studentList = Arrays.asList(
                new Student(102, "Shyam", 800),
                new Student(103, "Hari", 300),
                new Student(104, "Kisan", 900),
                new Student(105, "Madhur", 400),
                new Student(106, "Aman", 890)
                );
//        studentList.add(st);
//        get the topper using stream
        Student topper = studentList.stream().reduce((student1, student2) -> student1.getScore() > student2.getScore() ? student1 : student2).get();
        System.out.println(topper.getName());

        // using max
        Student topper1 = studentList.stream().max(Comparator.comparingDouble(Student::getScore)).get();
        System.out.println(topper1.getName());

        // get student who's marks is above 600
        List<Student> topperStudents = studentList.stream().filter(student -> student.getScore() > 600).collect(Collectors.toList());

        // Marks the name as uppercase and collect
        List<String> upperCaseNames = studentList.stream().map(student -> student.getName().toUpperCase()).collect(Collectors.toList());
        System.out.println(upperCaseNames);

        // give grace marks to the student who's marks is < 400
        List<Double> marks = studentList.stream().filter(student -> student.getScore() < 400).map(student -> student.getScore() + 20.0).collect(Collectors.toList());

        //Get names of top 3 students with score > 800, sorted by score.
        List<String> topper3 = studentList.stream().filter(student -> student.getScore() > 800).sorted(Comparator.comparingDouble(Student::getScore).reversed()).limit(3).map(Student::getName).toList();
        System.out.println(topper3);
    }
}
