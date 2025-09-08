import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an odd integer n: ");
        int n = sc.nextInt();

        if (n <= 0 || n % 2 == 0)
        {
            System.out.println("Please enter a positive odd integer.");
            return;
        }

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (j == i || j == n - 1 - i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
