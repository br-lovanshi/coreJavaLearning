package collections;

import java.util.*;

public class Lists  {

    public static void main(String[] args) {
        List list1 = new ArrayList();
        list1.add("one");
        list1.add(1);
        list1.add(true);
        System.out.println(list1);

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ram", 20, true));

//        System.out.println(studentList.toString());
        for (Student student: studentList){
//            System.out.println(student.toString());
        }

        List list2 = new Stack();
        list2.add(true);
        list2.add(4);
        list2.add("one");
        System.out.println(list2);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(25);
        pq.add(10);
        pq.add(6);
        pq.add(20);
        pq.add(11);
        System.out.println("Priority queue asc order");
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
