package com;



public class queue {

  private int SIZE = 5;

  private int[] items = new int[SIZE];

  private int front = -1;

  private int rear = -1;

  public boolean isFull() {

    return front == 0 && rear == SIZE - 1;

  }

  public boolean isEmpty() {

    return front == -1;

  }

  public void enqueue(int ele) {

    if (isFull()) {

      System.out.println("Queue Overflow");

    } else {

      if (front == -1)

        front = 0;

      rear++;

      items[rear] = ele;

      System.out.println("Element inserted: " + ele);

    }

  }

  public void dequeue() {

    if (isEmpty()) {

      System.out.println("Queue Underflow");

    } else {

      int ele = items[front];

      System.out.println("Element removed: " + ele);

      if (front >= rear) {

        front = -1;

        rear = -1;

      } else {

        front++;

      }

    }

  }

  public void display() {

    if (isEmpty()) {

      System.out.println("Queue is empty");

    } else {

      System.out.print("Queue elements: ");

      for (int i = front; i <= rear; i++) {

        System.out.print(items[i] + " ");

      }

      System.out.println();

    }

  }

  public static void main(String[] args) {

    queue q = new queue();

    q.enqueue(10);

    q.enqueue(20);

    q.enqueue(30);

    q.enqueue(40);

    q.enqueue(50);

    q.enqueue(60);

    q.display();

    q.dequeue();

    q.dequeue();

    q.display();

    q.dequeue();

    q.dequeue();

    q.dequeue();

    q.dequeue();

  }

}
