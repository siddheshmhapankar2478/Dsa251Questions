package LinkedList;

import java.util.HashMap;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class Q4_Reorder_List {
    public static void main(String[] args) {

    }

    public void reorderList(Node head) {
        Node temp = head;
        int count = 0;

        HashMap<Integer, Node> hm = new HashMap<>();
        while (temp != null) {
            hm.put(count, temp);
            count++;
            temp = temp.next;
        }
        for (int i = 0; i < count / 2; i++) {
            Node start = hm.get(i);
            Node last = hm.get(count - i - 1);
            start.next = last;

            if (i == count / 2 - 1) {
                if (count % 2 == 0)
                    last.next = null;
                else {
                    Node next = hm.get(i + 1);
                    last.next = next;
                    last.next.next = null;
                }
            } else {
                Node next = hm.get(i + 1);
                last.next = next;
            }
        }

    }
}
