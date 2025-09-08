import java.util.Scanner;

public class RightRotateArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Input elements
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        // Rotate right by 1
        int last = arr[n - 1];
        for (int i = n - 1; i > 0; i--)
        {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;

        // Output rotated array
        System.out.println("Array after right rotation:");
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
