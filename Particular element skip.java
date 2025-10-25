package hell;

public class P8 
{
    public static void main(String[] args) 
    {
        int[] arr = {10, 20, 30, 40, 50};
        int skip = 30;

        for (int n : arr) 
        {
            if (n == skip) 
            	continue;
            System.out.println(n);
        }
    }
}

