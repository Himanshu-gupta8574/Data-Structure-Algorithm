package Linked_List;
import org.w3c.dom.Node;

public class findng_lenght_linkedlist {
        public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);

        a.next = b;
        b.next = c;
        c.next = d;
        Node temp = a;
        int val = 0;
        while (temp != null) {
            System.out.println(temp.data);
            val++;
            temp = temp.next;
        }
        System.out.println("the size of liked list is" + val);
    }
}
