package hell;

public class P10 
{
    public static void main(String[] args) 
    {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Prime numbers:");
        for (int n : arr) 
        {
            if (isPrime(n)) 
            	System.out.print(n + " ");
        }
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

