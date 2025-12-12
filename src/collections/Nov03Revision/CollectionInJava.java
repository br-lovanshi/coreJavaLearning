package collections.Nov03Revision;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class CollectionInJava {
    public static <T> void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Ram");
        collection.add("Shyam");
        collection.add("Ravi");

        ArrayList<String> list = new ArrayList<>();
        list.add("Ram");
        list.add("4");
        list.remove(1);
        list.add(null);
        list.add(null);
        list.add(null);
        System.out.println("Arraylist " + list);
        System.out.println(list.get(0));
        System.out.println(list.contains("Ram"));
        System.out.println(list.indexOf("4"));

        LinkedList<String> ll = new LinkedList<>();
        ll.add("One");
        ll.add("two");
        ll.add("three");
        ll.add(null);
        ll.add(null);
        ll.add(null);
        System.out.println("LL " + ll);
        System.out.println(ll.add("Five"));
        ll.add(2, "Five");
        System.out.println(ll.get(2));

        Queue<String> queue = new LinkedList<>();
        queue.add("Ram");
        queue.add("Prit");
        queue.add("Shyam");
        queue.add("null");
        queue.add("null");
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);


        // priority queue
        PriorityQueue<Integer> integerPriorityQueue = new PriorityQueue<>(); // remove number based in as order by default
        integerPriorityQueue.offer(20);
        integerPriorityQueue.offer(10);
        integerPriorityQueue.offer(40);
        integerPriorityQueue.offer(24);
        integerPriorityQueue.offer(42);

        System.out.println("Priority queue: " + integerPriorityQueue);
        while(!integerPriorityQueue.isEmpty()){
            System.out.println(integerPriorityQueue.poll());
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a); // custom comparator
        pq.offer(20);
        pq.offer(10);
        pq.offer(30);
        System.out.println(pq.poll()); // 30 (highest priority)


        Deque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst(3);
        arrayDeque.addLast(3);
        arrayDeque.add(4);
        System.out.println("ArrayDeque " + arrayDeque);
        System.out.println(arrayDeque.getFirst());
        System.out.println(arrayDeque.poll());
    }
}
