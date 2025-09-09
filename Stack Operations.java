import java.util.Scanner;

public class StackOperations
{
    int top;
    int maxSize;
    int[] stack;

    StackOperations(int size)
    {
        maxSize = size;
        stack = new int[maxSize];
        top = -1;
    }

    // Push operation
    void push(int value)
    {
        if (isFull())
        {
            System.out.println("Stack Overflow! Cannot push " + value);
        }
        else
        {
            stack[++top] = value;
            System.out.println(value + " pushed into stack.");
        }
    }

    // Pop operation
    void pop()
    {
        if (isEmpty())
        {
            System.out.println("Stack Underflow! Cannot pop.");
        }
        else
        {
            System.out.println(stack[top--] + " popped from stack.");
        }
    }

    // Peek operation
    void peek()
    {
        if (isEmpty())
        {
            System.out.println("Stack is empty. Nothing to peek.");
        }
        else
        {
            System.out.println("Top element is: " + stack[top]);
        }
    }

    // Display stack
    void display()
    {
        if (isEmpty())
        {
            System.out.println("Stack is empty.");
        }
        else
        {
            System.out.println("Stack elements are:");
            for (int i = top; i >= 0; i--)
            {
                System.out.println(stack[i]);
            }
        }
    }

    // Check empty
    boolean isEmpty()
    {
        return (top == -1);
    }

    // Check full
    boolean isFull()
    {
        return (top == maxSize - 1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of stack: ");
        int size = sc.nextInt();

        StackOperations stack = new StackOperations(size);

        int choice;
        do
        {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Check if Empty");
            System.out.println("6. Check if Full");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter value to push: ");
                    int val = sc.nextInt();
                    stack.push(val);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.peek();
                    break;

                case 4:
                    stack.display();
                    break;

                case 5:
                    System.out.println(stack.isEmpty() ? "Stack is empty." : "Stack is not empty.");
                    break;

                case 6:
                    System.out.println(stack.isFull() ? "Stack is full." : "Stack is not full.");
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 7);

        sc.close();
    }
}
