package linkedlist;

class Node {
    int data;
    Node next;

    // constructor
    Node(int data){
        this.data = data;
        this.next = null;
    }

}

// {data:1,next:02} -> {data:2, next:null}
public class NodeList{
    Node head;

    // add not at the first
    public void addFirst(int data){
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }

    // add node at the end
    public void addAtLast(int data){
        Node temp = new Node(data);
        if(head == null){
            head = temp;
            return;
        }

        Node curr = head;

        while(curr.next != null){
            curr = curr.next;
        }

        curr.next = temp;
    }

    // print the list
    public void print(Node list){
        Node curr = list;
        while(curr != null){
            System.out.print(curr.data+ " -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    // find data in list
    public boolean search(int value){

        if(head != null && head.data == value) return true;
        Node curr = head.next;
        while(curr.next != null){
            if(curr.data == value) return true;
            curr = curr.next;
        }

        return false;
    }

    // find length
    public int length(){
        Node curr = head;
        if(head == null) return 0;
        int count = 0;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        return count;
    }

    public void delete(int value){
        if(head == null)return;
        if(head.data == value){
            head = head.next;
        }

        Node curr = head;
        while(curr.next != null){
            if(curr.next.data == value){
                curr.next = curr.next.next;
                return;

            }
            curr = curr.next;
        }

    }

    public Node findMiddle(){
        if(head == null)return null;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // remove middle ele
    public void removeMiddleNode(){
        if(head == null || head.next == null) return;
        Node prev = null;
        Node slow = head, fast = head;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
    }

    // remove nth from the end
    public static Node removeNthNode(Node list, int n){
        Node fast = null;
        if(list.data == 0)
             fast = list;
        for(int i = 0; i<n; i++){
            fast = fast.next;
        }
        Node slow = list;
        while(slow.next != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return list;

    }
    // reverse list
    // 1 -> 0 -> 2 -> 4 -> 5 ->  1 <- 0 <- 2 <- 4 <- 5
    public Node reverse(){
        Node curr = head;
        Node prev = null;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    // cycle detection
    public boolean listCycle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) return true;
        }
        return false;
    }


    // merge two sorted list
    public Node mergeSortedList(Node list1, Node list2){
        Node dummy = new Node(-1);
        Node tail = dummy;

        while(list1 != null && list2 != null){
            if(list1.data <= list2.data){
                tail.next = list1;
                list1 = list1.next;
            }else {
                tail.next = list2;
                list2 = list2.next;
            }

            tail = tail.next;
        }
        if(list1 != null){
            tail.next = list1;
        }else{
            tail.next = list2;
        }
        return dummy.next;
    }

    // sort list



    public static void main(String[] args) {
        NodeList list = new NodeList();
        list.addAtLast(2);
        list.addAtLast(3);
        list.addAtLast(5);
        list.addFirst(1);
        list.addFirst(0);
//        list.delete(5);
        list.print(list.head);
//        System.out.println("search " + list.search( 1));
//        System.out.println("Size "  + list.length());
//        System.out.println("Middle " + list.findMiddle());
//        list.removeMiddleNode();
//        System.out.println(list.reverse());

        NodeList list1 = new NodeList();
        list1.addAtLast(1);
        list1.addAtLast(3);
        list1.addAtLast(12);
        list1.print(list1.head);
        Node newList = list.mergeSortedList(list1.head,list.head);
        list.print(newList);
    }
}

/**
 * | Question                                                                                                    | Concept                       |
 * | ----------------------------------------------------------------------------------------------------------- | ----------------------------- |
 * | ✅ [Reverse a Linked List – LeetCode 206](https://leetcode.com/problems/reverse-linked-list/)                | Two Pointer, Iteration        |
 * | ✅ [Detect Cycle – LeetCode 141](https://leetcode.com/problems/linked-list-cycle/)                           | Floyd’s Algorithm             |
 * | ✅ [Remove Nth Node from End – LeetCode 19](https://leetcode.com/problems/remove-nth-node-from-end-of-list/) | Two Pointer                   |
 * | ✅ [Middle of Linked List – LeetCode 876](https://leetcode.com/problems/middle-of-the-linked-list/)          | Fast & Slow Pointers          |
 * | ✅ [Merge Two Sorted Lists – LeetCode 21](https://leetcode.com/problems/merge-two-sorted-lists/)             | Recursion                     |
 * | ✅ [Add Two Numbers – LeetCode 2](https://leetcode.com/problems/add-two-numbers/)                            | Math + Linked List            |
 * | ✅ [Palindrome Linked List – LeetCode 234](https://leetcode.com/problems/palindrome-linked-list/)            | Fast & Slow Pointer + Reverse |*/