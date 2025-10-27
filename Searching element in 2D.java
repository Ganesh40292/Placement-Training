package Two_Dimensional_Array;
public class P1 
{
    public static void main(String[] args) 
    {
        String[][] arr = {{"Apple", "Banana"}, {"Cherry", "Mango"}};
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.println(arr[i][j] + " ");
            }
        }
    }
}


