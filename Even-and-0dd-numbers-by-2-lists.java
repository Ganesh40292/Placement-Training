package hell;

import java.util.*;

public class P4 
{
    public static void main(String[] args) 
    {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        ArrayList <Integer> even = new ArrayList<>();
        ArrayList <Integer> odd = new ArrayList<>();

        for (int n : arr) 
        {
            if (n % 2 == 0) 
            	even.add(n);
            else 
            	odd.add(n);
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
