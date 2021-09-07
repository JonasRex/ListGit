package com.company;

public class Liste {

    Node head = null;
    Node tail = null;

    public Node insertFromHead(String s) {
        Node n = new Node(s);
        if (isEmpty()) {
            head = n;
            tail = n;
            return head;
        }

        head.previous = n;
        n.next = head;

        head = n;

        return head;
    }

    public boolean isEmpty() {
        if (head == null)
            return true;

        return false;
    }
}
