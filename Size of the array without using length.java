package hell;

public class P11 
{
    public static void main(String[] args) 
    {
        int[] arr = {10, 20, 30, 40};
        int count = 0;
        try {
            while (true) 
            {
                int temp = arr[count];
                count++;
            }
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            // End of array
        }

        System.out.println("Size of array = " + count);
    }
}
