package com;
class Node1
{
    char data;
    Node1 next;
    Node1(char data)
    {
        this.data = data;
    }
}

public class singly
{
    Node1 head;

    void insert(char data)
    {
        Node1 n = new Node1(data);
        if (head == null)
        {
            head = n;
        }
        else
        {
            Node1 t = head;
            while (t.next != null)
            {
                t = t.next;
            }
            t.next = n;
        }
    }

    int count(char x)
    {
        int c = 0;
        Node1 t = head;
        while (t != null)
        {
            if (t.data == x)
            {
                c++;
            }
            t = t.next;
        }
        return c;
    }

    void print()
    {
        Node1 t = head;
        while (t != null)
        {
            System.out.print(t.data);
            if (t.next != null)
            {
                System.out.print("->");
            }
            t = t.next;
        }
    }

    public static void main(String[] args)
    {
        singly s = new singly();
        s.insert('S');
        s.insert('M');
        s.insert('V');
        s.insert('I');
        s.insert('T');
        s.insert('M');

        s.print();
        System.out.println();
        System.out.println("Count of M: " + s.count('M'));
    }
}
