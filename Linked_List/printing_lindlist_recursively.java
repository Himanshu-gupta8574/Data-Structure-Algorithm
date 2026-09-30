package Linked_List;
public class printing_lindlist_recursively {
    public static void display(Node temp){
        if (temp == null) {
            return ;
        }
        System.out.println(temp.data);
        display(temp.next);
    }
    
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
        display(a);
    }
}
