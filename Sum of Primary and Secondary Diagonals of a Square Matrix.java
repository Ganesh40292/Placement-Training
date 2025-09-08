import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input size of square matrix
        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int arr[][] = new int[n][n];

        // Input matrix elements
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        int primarySum = 0;
        int secondarySum = 0;

        // Calculate sums
        for (int i = 0; i < n; i++)
        {
            primarySum += arr[i][i];               // primary diagonal
            secondarySum += arr[i][n - 1 - i];     // secondary diagonal
        }

        // Output
        System.out.println("Sum of Primary Diagonal = " + primarySum);
        System.out.println("Sum of Secondary Diagonal = " + secondarySum);
    }
}
