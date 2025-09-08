import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }

        
        for (int i = 0, j = n - 1; i < j; i++, j--) 
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

    
        System.out.println("Reversed Array:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(arr[i] + " ");
        }
    }
}
