package com;

class Dnode {
    int data;
    Dnode next;
    Dnode prev;

    Dnode(int data) {
        this.data = data;
    }
}

public class LinkL {

    Dnode head, sec, tail;

    LinkL() {
        // Creating 3 nodes
        head = new Dnode(10);
        sec = new Dnode(20);
        tail = new Dnode(30);

        // Linking next references
        head.next = sec;
        sec.next = tail;
        tail.next = null;

        // Linking prev references
        tail.prev = sec;
        sec.prev = head;
        head.prev = null;

        // Traversing forward
        System.out.println("Forward Traversal:");
        Dnode n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }

        // Traversing backward
        System.out.println("\nBackward Traversal:");
        Dnode m = tail;
        while (m != null) {
            System.out.print(m.data + " ");
            m = m.prev;
        }
    }

    public static void main(String[] args) {
        new LinkL();
    }
}
