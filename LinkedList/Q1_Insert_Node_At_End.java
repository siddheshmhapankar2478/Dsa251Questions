package LinkedList;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class Q1_Insert_Node_At_End {
    public static void main(String[] args) {
        Node head = new Node(100);
        insertAtEnd(head, 20);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

    }

    public static Node insertAtEnd(Node head, int x) {
        Node temp = head;
        Node newNode = new Node(x);

        if (temp == null) {
            return newNode;
        }

        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        return head;
    }

}