package com;
public class HellP 
{
    class Node 
    {
        int data;
        Node prev;
        Node next;

        Node(int d) 
        {
            this.data = d;
            this.prev = null;
            this.next = null;
        }
    }

    Node head = null;

    // ==========================================================
    // INSERT OPERATIONS
    // ==========================================================

    // Insert at the beginning
    public void insertAtBeginning(int data) 
    {
        Node newNode = new Node(data);

        if (head == null) 
        {
            head = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Insert at the end
    public void insertAtEnd(int data) 
    {
        Node newNode = new Node(data);

        if (head == null) 
        {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Insert at a given position (1-based indexing)
    public void insertAtPosition(int position, int data) 
    {
        if (position <= 0) 
        {
            System.out.println("Invalid position.");
            return;
        }

        if (position == 1) 
        {
            insertAtBeginning(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        int count = 1;

        while (temp != null && count < position - 1) 
        {
            temp = temp.next;
            count++;
        }

        if (temp == null) 
        {
            System.out.println("Position out of range.");
            return;
        }

        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null)
            temp.next.prev = newNode;

        temp.next = newNode;
    }

    // ==========================================================
    // DELETE OPERATIONS
    // ==========================================================

    // Delete at the beginning
    public void deleteAtBeginning() 
    {
        if (head == null) 
        {
            System.out.println("List is empty.");
            return;
        }

        head = head.next;

        if (head != null)
            head.prev = null;
    }

    // Delete at the end
    public void deleteAtEnd() 
    {
        if (head == null) 
        {
            System.out.println("List is empty.");
            return;
        }

        if (head.next == null) 
        {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.prev.next = null;
    }

    // Delete at a specific position
    public void deleteAtPosition(int position) 
    {
        if (head == null) 
        {
            System.out.println("List is empty.");
            return;
        }

        if (position == 1) 
        {
            deleteAtBeginning();
            return;
        }

        Node temp = head;
        int count = 1;

        while (temp != null && count < position)
        {
            temp = temp.next;
            count++;
        }

        if (temp == null) 
        {
            System.out.println("Position out of range.");
            return;
        }

        if (temp.next != null)
            temp.next.prev = temp.prev;

        if (temp.prev != null)
            temp.prev.next = temp.next;
    }

    // Delete by value
    public void deleteByValue(int value) 
    {
        if (head == null) 
        {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;

        while (temp != null && temp.data != value)
            temp = temp.next;

        if (temp == null) 
        {
            System.out.println("Value not found.");
            return;
        }

        if (temp == head)
            head = temp.next;

        if (temp.next != null)
            temp.next.prev = temp.prev;

        if (temp.prev != null)
            temp.prev.next = temp.next;

        System.out.println("Deleted value: " + value);
    }

    // ==========================================================
    // OTHER OPERATIONS
    // ==========================================================

    // Search an element
    public boolean search(int value) 
    {
        Node temp = head;

        while (temp != null) 
        {
            if (temp.data == value)
                return true;

            temp = temp.next;
        }
        return false;
    }

    // Count nodes
    public int countNodes() 
    {
        int count = 0;

        Node temp = head;

        while (temp != null) 
        {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Clear entire list
    public void clear() 
    {
        head = null;
    }

    // ==========================================================
    // PRINT OPERATIONS
    // ==========================================================

    // Print in forward direction
    public void printForward() 
    {
        Node temp = head;

        System.out.print("Forward: ");

        while (temp != null) 
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    // Print in backward direction
    public void printBackward() 
    {
        if (head == null) 
        {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        System.out.print("Backward: ");

        while (temp != null) 
        {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }

        System.out.println();
    }

    // ==========================================================
    // MAIN METHOD (DEMO)
    // ==========================================================
    public static void main(String[] args) 
    {
        HellP dll = new HellP();

        dll.insertAtBeginning(20);
        dll.insertAtBeginning(10);

        dll.insertAtEnd(30);
        dll.insertAtEnd(40);

        dll.insertAtPosition(3, 25);

        dll.printForward();
        dll.printBackward();

        dll.deleteAtBeginning();
        dll.deleteAtEnd();
        dll.deleteAtPosition(2);

        dll.printForward();

        dll.deleteByValue(30);

        dll.printForward();

        System.out.println("Count nodes: " + dll.countNodes());
        System.out.println("Searching 25: " + dll.search(25));

        dll.clear();
        dll.printForward();
    }
}
