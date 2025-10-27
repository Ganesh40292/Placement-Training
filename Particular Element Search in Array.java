package hell;

public class P9 
{
    public static void main(String[] args) 
    {
        int[] arr = {10, 20, 30, 40, 50};
        int search = 30;
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
        	System.out.println(search + " is found");
        else 
        	System.out.println(search + " not found");
    }
}

