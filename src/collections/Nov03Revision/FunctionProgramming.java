package collections.Nov03Revision;

import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface Calculator {
    int cal1(int a, int b);
}

class CalculatorImpl implements Calculator {
    public int cal1(int a, int b) {
        return a + b;
    }
}

@FunctionalInterface
interface Calculate {
    int calculation(int a, int b);
}

public class FunctionProgramming {
    public static void main(String[] args) {

        // calculation
        Calculate sum = (a, b) -> a + b;
        Calculate multiply = (a, b) -> a * b;
        Calculate subtract = (a, b) -> a - b;
        System.out.println(sum.calculation(3, 5));
        System.out.println(multiply.calculation(4, 9));
        System.out.println(subtract.calculation(4, 2));

        // consumer
        Consumer<Integer> consumer = a -> System.out.println(a);
        consumer.accept(20);

        // predicate
        Predicate<String> predicate = a -> a.equals("a");
        System.out.println(predicate.test("a"));

        // functional
        Function<Integer, String> function = (a) -> a.toString();
        System.out.println(function.apply(2));

        // supplier
        Supplier<String> supplier = () -> "Vicky";
        System.out.println(supplier.get());

        List<Integer> list = Arrays.asList(1, 5, 76, 2, 7, 1, 6);
//        Consumer<String> con = str -> System.out.println(str);
//        list.forEach(num -> System.out.println(num));
        list.forEach(System.out::println); // method reference

        List<Integer> numStream = list.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num + 1)
                .toList();
        System.out.println("numStream " + numStream);

        numStream.stream()
                .sorted()
                .forEach(System.out::println);


        List<Student1> student1List = Arrays.asList(new Student1(1, "Ravi", 10), new Student1(5, "Aman", 6.4), new Student1(8, "Krishna", 8), new Student1(2, "Hari", 9));

//        Collections.sort(student1List);
        // find the students cgpa > 7 in desc order
        List<Student1> above7Cgpa = student1List.stream()
                .filter(student -> student.getCgpa() > 7)
                .sorted((o1, o2) -> (int) (o2.getCgpa() - o1.getCgpa()))
                .distinct()
                .toList();

        // print the name of topper
        above7Cgpa.stream()
                .sorted((s1, s2) -> (int) (s2.getCgpa() - s1.getCgpa()))
                .limit(1)
                .map(s -> s.getName().toUpperCase())
                .forEach(System.out::println);

       Optional<Student1> topper = above7Cgpa.stream()
               .max(Comparator.comparingDouble(Student1::getCgpa));
        System.out.println("Topper " + topper.get().getName());


        student1List.forEach(System.out::println);


        // Optional
        Optional<String> name =  Optional.ofNullable(null);
        name.orElse("Name");
        System.out.println("Optional " + name);

        Optional<String> opName = Optional.empty();
        opName.orElse("Guest");
        System.out.println(opName);

        // flatmap
        List<List<Integer>> matrix = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(5,6),
                Arrays.asList(3,4)
        );

        matrix.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);

    }
}

class Student1 implements Comparable<Student1> {
    private int id;
    private String name;
    private double cgpa;

    public Student1(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student1 = (Student1) o;
        return id == student1.id && Objects.equals(name, student1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }


    @Override
    public int compareTo(Student1 o) {
        return o.id - this.id;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }
}
/*
Predicate -> boolean -> test()
Consumer -> void -> accept()
Function -> change data T -> V -> apply()
Supplier -> get value -> get()

Runnable -> have void method run
Callable -> have call method
*/




















