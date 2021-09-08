package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListeTest {

    Liste liste = new Liste();
    Liste listeTom = new Liste();

    @BeforeEach
    void setUp() {
        Node node0 = new Node("0");
        Node node1 = new Node("1");
        Node node2 = new Node("2");
        Node node3 = new Node("3");

        liste.insertFromHead(node0);
        liste.insertFromHead(node1);
        liste.insertFromHead(node2);
        liste.insertFromHead(node3);
    }



    @org.junit.jupiter.api.Test
    void insertFromHead() {

        assertEquals("Viktor", liste.insertFromHead(new Node("Viktor")).data);
        assertEquals("Christian", liste.insertFromHead(new Node("Christian")).data);
    }

    @org.junit.jupiter.api.Test
    void insertFromTail() {

        assertEquals("Viktor", liste.insertFromTail("Viktor").data);
        assertEquals("Christian", liste.insertFromTail("Christian").data);
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        assertEquals(true, liste.isEmpty());
        liste.insertFromHead(new Node("Viktor"));
        assertEquals(false, liste.isEmpty());
    }

    @Test
    void printListFromHead() {

        assertEquals("3210", liste.printFromHead());
    }

    @Test
    void printListFromTail() {
        assertEquals("0123", liste.printFromTail());
    }

    @Test
    void removeFromHeadTest() {
        assertEquals("3", liste.removeFromHead().data);
        assertEquals("210",liste.printFromHead());
//        Node node = new Node("");
//
//        assertEquals(node.data, listeTom.removeFromHead().data);
//
//        Node testNode = new Node("4");
//        liste.insertFromHead(testNode);
//        assertEquals(testNode, listeTom.removeFromHead());
    }
}