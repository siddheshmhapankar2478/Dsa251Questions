package LinkedList;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class Q3_Delete_Nth_Node {
    class Solution {
        public Node removeNthFromEnd(Node head, int n) {
            Node temp = head;
            int count = 0;

            while (temp != null) {
                count++;
                temp = temp.next;
            }

            int index = count - n - 1;

            if (index <= 0 || count == 1)
                return head.next;

            temp = head;
            while (index > 0) {
                index--;
                temp = temp.next;
            }
            temp.next = temp.next.next;
            return head;
        }
    }
}
