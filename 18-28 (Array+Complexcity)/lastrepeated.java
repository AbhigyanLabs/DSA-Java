import java.util.*;
public class lastrepeated
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the size of the array ");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array ");
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int value=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    value=arr[i];
                    
                }
                //break; To know the first repeated elements.
            }
        }
        System.out.println("Last repeated element is ");
        System.out.println(value);
    }
}