package hell;

import java.util.*;

public class Combined
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 15, 20, 25, 30, 35};
        String[] strArr = {"Apple", "Banana", "Cherry"};

        System.out.println("------ Array Operations Menu ------");
        System.out.println("1. Print all elements from string array");
        System.out.println("2. Print all elements in reverse order");
        System.out.println("3. Convert array to ArrayList");
        System.out.println("4. Print even and odd numbers (2 lists)");
        System.out.println("5. Count even and odd numbers");
        System.out.println("6. Find sum of array");
        System.out.println("7. Find sum of even and odd numbers");
        System.out.println("8. Skip a particular element");
        System.out.println("9. Search a particular element");
        System.out.println("10. Print prime numbers");
        System.out.println("11. Find size of array (without length)");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) 
        {
            case 1:
                for (String s : strArr) System.out.println(s);
                break;

            case 2:
                for (int i = arr.length - 1; i >= 0; i--)
                    System.out.println(arr[i]);
                break;

            case 3:
                List<String> list = Arrays.asList(strArr);
                System.out.println(list);
                break;

            case 4:
                ArrayList<Integer> even = new ArrayList<>();
                ArrayList<Integer> odd = new ArrayList<>();
                for (int n : arr) 
                {
                    if (n % 2 == 0) 
                    	even.add(n);
                    else 
                    	odd.add(n);
                }
                System.out.println("Even: " + even);
                System.out.println("Odd: " + odd);
                break;

            case 5:
                int evenCount = 0, oddCount = 0;
                for (int n : arr) 
                {
                    if (n % 2 == 0) 
                    	evenCount++;
                    else 
                    	oddCount++;
                }
                System.out.println("Even Count = " + evenCount);
                System.out.println("Odd Count = " + oddCount);
                break;

            case 6:
                int sum = 0;
                for (int n : arr) 
                	sum += n;
                System.out.println("Sum = " + sum);
                break;

            case 7:
                int evenSum = 0, oddSum = 0;
                for (int n : arr) 
                {
                    if (n % 2 == 0) 
                    	evenSum += n;
                    else 
                    	oddSum += n;
                }
                System.out.println("Even Sum = " + evenSum);
                System.out.println("Odd Sum = " + oddSum);
                break;

            case 8:
                System.out.print("Enter element to skip: ");
                int skip = sc.nextInt();
                for (int n : arr) 
                {
                    if (n == skip) 
                    	continue;
                    System.out.println(n);
                }
                break;

            case 9:
                System.out.print("Enter element to search: ");
                int search = sc.nextInt();
                boolean found = false;
                for (int n : arr) 
                {
                    if (n == search) 
                    {
                        found = true;
                        break;
                    }
                }
                if (found)
                    System.out.println(search + " found!");
                else
                    System.out.println(search + " not found!");
                break;

            case 10:
                System.out.println("Prime numbers in array:");
                for (int n : arr) 
                {
                    if (isPrime(n)) 
                    	System.out.print(n + " ");
                }
                break;

            case 11:
                int count = 0;
                try 
                {
                    while (true) 
                    {
                        int temp = arr[count];
                        count++;
                    }
                } catch (ArrayIndexOutOfBoundsException e) 
                {
                    // End of array
                }
                System.out.println("Size of array = " + count);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }

    static boolean isPrime(int n) 
    {
        if (n < 2) 
        	return false;
        for (int i = 2; i <= Math.sqrt(n); i++) 
        {
            if (n % i == 0) 
            	return false;
        }
        return true;
    }
}

