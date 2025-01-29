package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Lists {

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
    }
}
