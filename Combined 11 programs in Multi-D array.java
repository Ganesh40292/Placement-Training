package Multi_Dimensional_Array;

import java.util.*;

public class Combined
{
    public static void main(String[] args)
    {
        System.out.println("===== 1) Print all elements from 3D array =====");
        printAllElements();

        System.out.println("\n===== 2) Print all elements in reverse order =====");
        printReverse();

        System.out.println("\n===== 3) Convert array to ArrayList =====");
        convertToArrayList();

        System.out.println("\n===== 4) Separate even and odd numbers =====");
        separateEvenOdd();

        System.out.println("\n===== 5) Count even and odd numbers =====");
        countEvenOdd();

        System.out.println("\n===== 6) Find sum of all elements =====");
        sumAll();

        System.out.println("\n===== 7) Find sum of even and odd =====");
        sumEvenOdd();

        System.out.println("\n===== 8) Skip particular element =====");
        skipElement();

        System.out.println("\n===== 9) Search particular element =====");
        searchElement();

        System.out.println("\n===== 10) Print prime numbers =====");
        printPrimes();

        System.out.println("\n===== 11) Find size without length =====");
        sizeWithoutLength();
    }

    static void printAllElements()
    {
        int[][][] arr = {{{1,2},{3,4}},{{5,6},{7,8}}};
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                for(int k=0; k<arr[i][j].length; k++)
                {
                    System.out.print(arr[i][j][k] + " ");
                }
            }
        }
    }

    static void printReverse()
    {
        int[][][] arr = {{{1,2},{3,4}},{{5,6},{7,8}}};
        for(int i=arr.length-1; i>=0; i--)
        {
            for(int j=arr[i].length-1; j>=0; j--)
            {
                for(int k=arr[i][j].length-1; k>=0; k--)
                {
                    System.out.print(arr[i][j][k] + " ");
                }
            }
        }
    }

    static void convertToArrayList()
    {
        Integer[][][] arr = {{{1,2},{3,4}},{{5,6},{7,8}}};
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                for(int k=0; k<arr[i][j].length; k++)
                {
                    list.add(arr[i][j][k]);
                }
            }
        }
        System.out.println(list);
    }

    static void separateEvenOdd()
    {
        int[][][] arr = {{{1,2},{3,4}},{{5,6},{7,8}}};
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                for(int k=0; k<arr[i][j].length; k++)
                {
                    if(arr[i][j][k] % 2 == 0)
                        even.add(arr[i][j][k]);
                    else
                        odd.add(arr[i][j][k]);
                }
            }
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }

    static void countEvenOdd()
    {
        int[][][] arr = {{{1,2},{3,4}},{{5,6},{7,8}}};
        int even=0, odd=0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                for(int k=0; k<arr[i][j].length; k++)
                {
                    if(arr[i][j][k]%2==0)
                        even++;
                    else
                        odd++;
                }
            }
        }
        System.out.println("Even count: " + even);
        System.out.println("Odd count: " + odd);
    }

    static void sumAll()
    {
        int[][][] arr = {{{1,2},{3,4}},{{5,6},{7,8}}};
        int sum=0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                for(int k=0; k<arr[i][j].length; k++)
                {
                    sum += arr[i][j][k];
                }
            }
        }
        System.out.println("Sum: " + sum);
    }

    static void sumEvenOdd()
    {
        int[][][] arr = {{{1,2},{3,4}},{{5,6},{7,8}}};
        int evenSum=0, oddSum=0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                for(int k=0; k<arr[i][j].length; k++)
                {
                    if(arr[i][j][k]%2==0)
                        evenSum += arr[i][j][k];
                    else
                        oddSum += arr[i][j][k];
                }
            }
        }
        System.out.println("Even Sum: " + evenSum);
        System.out.println("Odd Sum: " + oddSum);
    }

    static void skipElement()
    {
        int[][][] arr = {{{1,2},{3,4}},{{5,6},{7,8}}};
        int skip = 6;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                for(int k=0; k<arr[i][j].length; k++)
                {
                    if(arr[i][j][k] == skip)
                        continue;
                    System.out.print(arr[i][j][k] + " ");
                }
            }
        }
    }

    static void searchElement()
    {
        int[][][] arr = {{{1,2},{3,4}},{{5,6},{7,8}}};
        int search = 7;
        boolean found = false;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                for(int k=0; k<arr[i][j].length; k++)
                {
                    if(arr[i][j][k]==search)
                        found = true;
                }
            }
        }
        System.out.println(search + (found ? " found" : " not found"));
    }

    static void printPrimes()
    {
        int[][][] arr = {{{2,3},{4,5}},{{6,7},{8,9}}};
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                for(int k=0; k<arr[i][j].length; k++)
                {
                    int n = arr[i][j][k];
                    boolean prime = true;
                    if(n < 2) prime = false;
                    for(int p=2; p<=n/2; p++)
                    {
                        if(n%p==0)
                        {
                            prime=false;
                            break;
                        }
                    }
                    if(prime)
                        System.out.print(n + " ");
                }
            }
        }
    }

    static void sizeWithoutLength()
    {
        int[][][] arr = {{{1,2},{3,4}},{{5,6},{7,8}}};
        int count=0;
        try
        {
            for(int i=0; ; i++)
            {
                for(int j=0; ; j++)
                {
                    for(int k=0; ; k++)
                    {
                        int x = arr[i][j][k];
                        count++;
                    }
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Total size: " + count);
        }
    }
}

