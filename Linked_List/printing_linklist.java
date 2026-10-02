package Linked_List;
public class printing_linklist {
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
        for(int i=0;i<4;i++){
            System.out.println(temp.data);
            temp = temp.next;
        }
        Node bamp = a;
        while (bamp != null) {
            System.out.println(bamp.data);
            bamp = bamp.next;
        }
    }
}
