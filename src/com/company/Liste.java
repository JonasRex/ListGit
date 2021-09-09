package com.company;

public class Liste {

    Node head = null;
    Node tail = null;

    public Node insertFromHead(Node n) {
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
        while (n != null) {
            output += n.data;
            n = n.next;
        }

        return output;
    }

    public String printFromTail() {
        String output = "";
        Node n = tail;
        while (n != null) {
            output += n.data;
            n = n.previous;
        }

        return output;
    }

    public Node removeFromHead() {
        Node node = new Node("");
        if (!isEmpty()) {
            if (head == tail) {
                node = head;
                head = null;
                tail = null;
                return node;
            }
            node = head;

            head = head.next;

            head.previous.next = null;

            head.previous = null;

            return node;
        }
        return node;
    }

    public Node removeFromTail() {
        Node node = new Node("");
        if (!isEmpty()) {
            if (head == tail) {
                node = tail;
                head = null;
                tail = null;
                return node;
            }
            node = tail;

            tail = tail.previous;

            tail.next.previous = null;

            tail.next = null;

            return node;
        }
        return node;
    }



    public Node findNodeByData(String s) {
        Node n = head;
        while (n != null) {
            if(n.data == s){
                return n;
            }
            n = n.next;
        }
        return n;
    }

    public Node removeNodeFromList(Node n) {
        Node removedNode = n;
        if(n == head){
            return removeFromHead();
        }
        if(n == tail){
            return removeFromTail();
        }

        n.previous.next = n.next;
        n.next.previous = n.previous;
        return removedNode;
    }

    public Node insertNodeToList(Node oldNode, Node newNode) {

    }
}
