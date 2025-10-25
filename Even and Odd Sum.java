package hell;
public class Q7 
{
    public static void main(String[] args) 
    {
        int[] arr = {10, 15, 20, 25, 30};
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
    }
}
