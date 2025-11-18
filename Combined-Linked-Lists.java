package com;

//CombinedLinkedLists.java

public class CombinedLinkedLists
{
 // Singly Linked List
 static class SinglyLinkedList
 {
     class Node
     {
         int data;
         Node next;
         Node(int data)
         {
             this.data = data;
             this.next = null;
         }
     }
     Node head;

     public void insertEnd(int data)
     {
         Node newNode = new Node(data);
         if (head == null)
         {
             head = newNode;
             return;
         }
         Node temp = head;
         while (temp.next != null)
         {
             temp = temp.next;
         }
         temp.next = newNode;
     }

     public void delete(int key)
     {
         if (head == null)
         {
             return;
         }
         if (head.data == key)
         {
             head = head.next;
             return;
         }
         Node temp = head;
         while (temp.next != null && temp.next.data != key)
         {
             temp = temp.next;
         }
         if (temp.next != null)
         {
             temp.next = temp.next.next;
         }
     }

     public void printList()
     {
         Node temp = head;
         while (temp != null)
         {
             System.out.print(temp.data + " ");
             temp = temp.next;
         }
         System.out.println();
     }

     public boolean search(int key)
     {
         Node temp = head;
         while (temp != null)
         {
             if (temp.data == key)
             {
                 return true;
             }
             temp = temp.next;
         }
         return false;
     }
 }

 // Doubly Linked List
 static class DoublyLinkedList
 {
     class Node
     {
         int data;
         Node prev, next;
         Node(int data)
         {
             this.data = data;
             this.prev = null;
             this.next = null;
         }
     }
     Node head;

     public void insertEnd(int data)
     {
         Node newNode = new Node(data);
         if (head == null)
         {
             head = newNode;
             return;
         }
         Node temp = head;
         while (temp.next != null)
         {
             temp = temp.next;
         }
         temp.next = newNode;
         newNode.prev = temp;
     }

     public void delete(int key)
     {
         Node temp = head;
         while (temp != null)
         {
             if (temp.data == key)
             {
                 if (temp.prev != null)
                 {
                     temp.prev.next = temp.next;
                 }
                 else
                 {
                     head = temp.next;
                 }
                 if (temp.next != null)
                 {
                     temp.next.prev = temp.prev;
                 }
                 break;
             }
             temp = temp.next;
         }
     }

     public void printList()
     {
         Node temp = head;
         while (temp != null)
         {
             System.out.print(temp.data + " ");
             temp = temp.next;
         }
         System.out.println();
     }

     public boolean search(int key)
     {
         Node temp = head;
         while (temp != null)
         {
             if (temp.data == key)
             {
                 return true;
             }
             temp = temp.next;
         }
         return false;
     }
 }

 // Circular Singly Linked List
 static class CircularSinglyLinkedList
 {
     class Node
     {
         int data;
         Node next;
         Node(int data)
         {
             this.data = data;
             this.next = null;
         }
     }
     Node last;

     public void insertEnd(int data)
     {
         Node newNode = new Node(data);
         if (last == null)
         {
             last = newNode;
             last.next = last;
             return;
         }
         newNode.next = last.next;
         last.next = newNode;
         last = newNode;
     }

     public void delete(int key)
     {
         if (last == null)
         {
             return;
         }
         Node temp = last.next, prev = last;
         do
         {
             if (temp.data == key)
             {
                 if (temp == last && temp.next == last)
                 {
                     last = null;
                 }
                 else
                 {
                     prev.next = temp.next;
                     if (temp == last)
                     {
                         last = prev;
                     }
                 }
                 break;
             }
             prev = temp;
             temp = temp.next;
         }
         while (temp != last.next);
     }

     public void printList()
     {
         if (last == null)
         {
             System.out.println();
             return;
         }
         Node temp = last.next;
         do
         {
             System.out.print(temp.data + " ");
             temp = temp.next;
         }
         while (temp != last.next);
         System.out.println();
     }

     public boolean search(int key)
     {
         if (last == null)
         {
             return false;
         }
         Node temp = last.next;
         do
         {
             if (temp.data == key)
             {
                 return true;
             }
             temp = temp.next;
         }
         while (temp != last.next);
         return false;
     }
 }

 // Circular Doubly Linked List
 static class CircularDoublyLinkedList
 {
     class Node
     {
         int data;
         Node next, prev;
         Node(int data)
         {
             this.data = data;
             this.next = null;
             this.prev = null;
         }
     }
     Node head;

     public void insertEnd(int data)
     {
         Node newNode = new Node(data);
         if (head == null)
         {
             head = newNode;
             head.next = head;
             head.prev = head;
             return;
         }
         Node last = head.prev;
         last.next = newNode;
         newNode.prev = last;
         newNode.next = head;
         head.prev = newNode;
     }

     public void delete(int key)
     {
         if (head == null)
         {
             return;
         }
         Node temp = head;
         do
         {
             if (temp.data == key)
             {
                 if (temp.next == temp && temp.prev == temp)
                 {
                     head = null;
                     break;
                 }
                 temp.prev.next = temp.next;
                 temp.next.prev = temp.prev;
                 if (temp == head)
                 {
                     head = head.next;
                 }
                 break;
             }
             temp = temp.next;
         }
         while (temp != head);
     }

     public void printList()
     {
         if (head == null)
         {
             System.out.println();
             return;
         }
         Node temp = head;
         do
         {
             System.out.print(temp.data + " ");
             temp = temp.next;
         }
         while (temp != head);
         System.out.println();
     }

     public boolean search(int key)
     {
         if (head == null)
         {
             return false;
         }
         Node temp = head;
         do
         {
             if (temp.data == key)
             {
                 return true;
             }
             temp = temp.next;
         }
         while (temp != head);
         return false;
     }
 }

 // Java Built-in LinkedList (for completeness)
 static class JavaBuiltInLinkedListDemo
 {
     java.util.LinkedList<Integer> list = new java.util.LinkedList<Integer>();

     public void insertEnd(int data)
     {
         list.add(data);
     }

     public void delete(int data)
     {
         list.removeFirstOccurrence(data);
     }

     public void printList()
     {
         for (int item : list)
         {
             System.out.print(item + " ");
         }
         System.out.println();
     }

     public boolean search(int key)
     {
         return list.contains(key);
     }
 }

 public static void main(String[] args)
 {
     // You can test each implementation here
     // Example:
     SinglyLinkedList sll = new SinglyLinkedList();
     sll.insertEnd(10);
     sll.insertEnd(20);
     sll.insertEnd(30);
     sll.printList();
     sll.delete(20);
     sll.printList();

     DoublyLinkedList dll = new DoublyLinkedList();
     dll.insertEnd(40);
     dll.insertEnd(50);
     dll.insertEnd(60);
     dll.printList();
     dll.delete(50);
     dll.printList();

     CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
     csll.insertEnd(70);
     csll.insertEnd(80);
     csll.insertEnd(90);
     csll.printList();
     csll.delete(80);
     csll.printList();

     CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
     cdll.insertEnd(100);
     cdll.insertEnd(110);
     cdll.insertEnd(120);
     cdll.printList();
     cdll.delete(110);
     cdll.printList();

     JavaBuiltInLinkedListDemo jll = new JavaBuiltInLinkedListDemo();
     jll.insertEnd(130);
     jll.insertEnd(140);
     jll.insertEnd(150);
     jll.printList();
     jll.delete(140);
     jll.printList();
 }
}

