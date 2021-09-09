package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListeTest {

    Liste liste = new Liste();
    Liste tomListe = new Liste();

    @BeforeEach
    void setUp() {
        Node node0 = new Node("0");
        Node node1 = new Node("1");
        Node node2 = new Node("2");
        Node node3 = new Node("3");
        Node node4 = new Node("4");
        Node node5 = new Node("5");
        Node node6 = new Node("6");
        Node node7 = new Node("7");

        liste.insertFromHead(node0);
        liste.insertFromHead(node1);
        liste.insertFromHead(node2);
        liste.insertFromHead(node3);
        liste.insertFromHead(node4);
        liste.insertFromHead(node5);
        liste.insertFromHead(node6);
        liste.insertFromHead(node7);
    }


    @org.junit.jupiter.api.Test
    void insertFromHead() {

        assertEquals("Viktor", liste.insertFromHead(new Node("Viktor")).data);
        assertEquals("Christian", liste.insertFromHead(new Node("Christian")).data);
    }

    @org.junit.jupiter.api.Test
    void insertFromTail() {

        assertEquals("Viktor", liste.insertFromTail(new Node("Viktor")).data);
        assertEquals("Christian", liste.insertFromTail(new Node("Christian")).data);
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {

        assertEquals(true, tomListe.isEmpty());
        tomListe.insertFromHead(new Node("Viktor"));
        assertEquals(false, tomListe.isEmpty());
    }

    @Test
    void printListFromHead() {

        assertEquals("76543210", liste.printFromHead());
    }

    @Test
    void printListFromTail() {
        assertEquals("01234567", liste.printFromTail());
    }

    @Test
    void removeFromHeadTest() {
        assertEquals("7", liste.removeFromHead().data);
        assertEquals("6543210", liste.printFromHead());
//        Node node = new Node("");
//
//        assertEquals(node.data, listeTom.removeFromHead().data);
//
//        Node testNode = new Node("4");
//        liste.insertFromHead(testNode);
//        assertEquals(testNode, listeTom.removeFromHead());
    }

    @Test
    void findNodeTest() {
        assertEquals("2", liste.findNodeByData("2").data);
    }

    @Test
    void removeNode() {
        System.out.println(liste.printFromHead());
        assertEquals("4", liste.removeNodeFromList(liste.findNodeByData("4")).data);
        System.out.println(liste.printFromHead());
    }

    @Test
    void insertNodeAfterNodeTest() {
        System.out.println(liste.printFromHead());
        assertEquals("8", liste.insertNodeAfterNode(liste.findNodeByData("0"), new Node("8")).data);
        System.out.println(liste.printFromHead());
        assertEquals("9", liste.insertNodeAfterNode(liste.findNodeByData("4"), new Node("9")).data);
        System.out.println(liste.printFromHead());
    }

    @Test
    void insertNodeBeforeNodeTest() {
        System.out.println(liste.printFromHead());
        assertEquals("8", liste.insertNodeBeforeNode(liste.findNodeByData("7"), new Node("8")).data);
        System.out.println(liste.printFromHead());
        assertEquals("9", liste.insertNodeBeforeNode(liste.findNodeByData("4"), new Node("9")).data);
        System.out.println(liste.printFromHead());
    }
}