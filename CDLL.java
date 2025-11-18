package com;

//CircularDoublyLinkedList.java
public class CircularDoublyLinkedList {
 static class Node {
     int data;
     Node next, prev;
     Node(int data) {
         this.data = data;
         this.next = null;
         this.prev = null;
     }
 }
 Node head;

 // Add node at the end
 public void addEnd(int data) {
     Node newNode = new Node(data);
     if (head == null) {
         head = newNode;
         head.next = head;
         head.prev = head;
     } else {
         Node last = head.prev;
         last.next = newNode;
         newNode.prev = last;
         newNode.next = head;
         head.prev = newNode;
     }
 }

 // Print list in forward direction
 public void printList() {
     if (head == null) return;
     Node temp = head;
     do {
         System.out.print(temp.data + " ");
         temp = temp.next;
     } while (temp != head);
     System.out.println();
 }
}
