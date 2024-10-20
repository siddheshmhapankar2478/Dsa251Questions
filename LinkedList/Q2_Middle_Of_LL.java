package LinkedList;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class Q2_Middle_Of_LL {
    public static void main(String[] args) {
        Node head = new Node(100);
        middleNode(head);
    }

    public static Node middleNode(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        temp = head;
        int mid = count / 2;
        while (mid > 0) {
            temp = temp.next;
            mid--;
        }
        return temp;
    }

    public Node middleNode2(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}