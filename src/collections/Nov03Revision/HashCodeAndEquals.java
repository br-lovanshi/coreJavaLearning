package collections.Nov03Revision;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

class Student implements Comparable<Student> {
    private Long id;
    private String name;


    Student(Long id, String name){
        this.id = id;
        this.name = name;
    }

    public Long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public boolean equals(Object student){
        if(this == student) return true; // if reference is same return true
        Student student1 = (Student) student;
        return id == student1.getId() && Objects.equals(this.name, student1.getName());
    }

    @Override
    public int hashCode(){
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(Student o) {
        return (int) this.name.compareTo(o.name); // giving data by id desc
    }
}

public class HashCodeAndEquals {
    public static void main(String[] args) {
        Student student = new Student(1L, "Brajesh");
        Student student1 = new Student(1L, "Brajesh");

        System.out.println(student1.equals(student));
        System.out.println(student1.hashCode() + " " + student.hashCode());

        List<Student> students = Arrays.asList(student1, student, new Student(3L, "Vicky"), new Student(5L, "Pricky"));
//        System.out.println("Student List " + students);
        Collections.sort(students); // sorting using comparable

        for(Student st: students){
            System.out.println(st.getName());
        }
//        System.out.println("Student List ");

        String name = "Brajesh";
        String name1 = new String("Brajesh");
        System.out.println(name.equals(name1));
        System.out.println(name == name1);

        Integer num = 10;
        int num1 = 10;
        System.out.println(num == num1);
        System.out.println(num.equals(num1));

        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Ram");
        hashMap.put(2, "Ram");

        System.out.println(hashMap.containsKey(1));
        System.out.println(hashMap.get(1));

        Set<Map.Entry<Integer, String>> entrySet = hashMap.entrySet();
        System.out.println(entrySet);
        Collection<String> values = hashMap.values();
        System.out.println(values);
        Set<Integer> keys = hashMap.keySet();
        System.out.println(keys);
        for(Map.Entry<Integer, String> entrySet1: entrySet){
            entrySet1.getValue();
            System.out.println(entrySet1.getKey());
        }

        Map<Integer, String> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put(1, "Deer");
        concurrentMap.put(2, "Cow");
        concurrentMap.put(3, "Buffalo");

        for(Map.Entry<Integer, String> entry : concurrentMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
