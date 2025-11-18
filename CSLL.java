package com;

//CircularSinglyLinkedList.java
public class CircularSinglyLinkedList {
 static class Node {
     int data;
     Node next;
     Node(int data) {
         this.data = data;
         this.next = null;
     }
 }
 Node last;

 // Add node to empty list
 public void addToEmpty(int data) {
     Node newNode = new Node(data);
     last = newNode;
     last.next = last;
 }

 // Add node at the end
 public void addEnd(int data) {
     if (last == null) {
         addToEmpty(data);
         return;
     }
     Node newNode = new Node(data);
     newNode.next = last.next;
     last.next = newNode;
     last = newNode;
 }

 // Print the circular list
 public void printList() {
     if (last == null) return;
     Node temp = last.next;
     do {
         System.out.print(temp.data + " ");
         temp = temp.next;
     } while (temp != last.next);
     System.out.println();
 }
}

