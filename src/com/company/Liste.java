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

    public Node insertFromTail(String s) {
        Node n = new Node(s);
        if (isEmpty()) {
            head = n;
            tail = n;
            return tail;
        }

        tail.next = n;
        n.previous = head;

        tail = n;

        return tail;
    }

    public boolean isEmpty() {
        if (head == null)
            return true;
        return false;
    }

    public String printFromHead() {
        String output = "";
        Node n = head;
        while(n != null){
            output += n.data;
            n = n.next;
        }

        return output;
    }

    public String printFromTail() {
        String output = "";
        Node n = tail;
        while(n != null){
            output += n.data;
            n = n.previous;
        }

        return output;
    }

    public String removeFromHead() {
        if(!isEmpty()){
            if(head == tail){
                return head.data;
            }
            Node n = head;

            head.next.previous = null;
            head = head.next;

            return n.data;
        }
        return null;
    }
}
