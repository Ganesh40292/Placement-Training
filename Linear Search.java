import java.util.Scanner;

public class Main 

{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }

        
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        
        int index = -1;
        for (int i = 0; i < n; i++) 
        {
            if (arr[i] == key) 
            {
                index = i; // store index where found
                break;
            }
        }

        
        System.out.println(index);
    }
}
