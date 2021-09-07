package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListeTest {

    Liste liste = new Liste();

    @org.junit.jupiter.api.Test
    void insertFromHead() {

        assertEquals("Viktor", liste.insertFromHead("Viktor").data);
        assertEquals("Christian", liste.insertFromHead("Christian").data);
    }

    @org.junit.jupiter.api.Test
    void insertFromTail() {

        assertEquals("Viktor", liste.insertFromTail("Viktor").data);
        assertEquals("Christian", liste.insertFromTail("Christian").data);
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        assertEquals(true, liste.isEmpty());
        liste.insertFromHead("Viktor");
        assertEquals(false, liste.isEmpty());
    }

    @Test
    void printListFromHead() {
        liste.insertFromHead("1");
        liste.insertFromHead("2");
        liste.insertFromHead("3");
        assertEquals("321", liste.printFromHead());
    }

    @Test
    void printListFromTail() {
        liste.insertFromHead("1");
        liste.insertFromHead("2");
        liste.insertFromHead("3");
        assertEquals("123", liste.printFromTail());
    }

    @Test
    void removeFromHeadTest() {


        liste.insertFromHead("1");
        liste.insertFromHead("2");
        liste.insertFromHead("3");

        assertEquals("3", liste.removeFromHead());
        assertEquals("21",liste.printFromHead());
    }


}