package com;

//DoublyLinkedList.java
public class DoublyLinkedList {
 class Node {
     int data;
     Node prev;
     Node next;
     Node(int d) {
         data = d;
         prev = null;
         next = null;
     }
 }
 Node head; // head of list

 // Insert at the end
 public void append(int new_data) {
     Node new_node = new Node(new_data);
     if (head == null) {
         head = new_node;
         return;
     }
     Node last = head;
     while (last.next != null)
         last = last.next;
     last.next = new_node;
     new_node.prev = last;
 }

 // Print in forward direction
 public void printList() {
     Node node = head;
     while (node != null) {
         System.out.print(node.data + " ");
         node = node.next;
     }
 }
}
