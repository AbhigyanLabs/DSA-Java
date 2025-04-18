import java.util.*;
public class sort01
{
    //swapping fun.
    static void swap(int [] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    //sorting fun. optimum approach is to count the number of 0's in the array & print them in a new array.
    static void sortzerosandones(int arr[])
    {
        int zero=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                zero++;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(i<zero)
            {
                arr[i]=0;
            }
            else
            {
                arr[i]=1;
            }
        }
    }

    //main fun.
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the arrray");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The original array is");
        for(int i=0;i<arr.length;i++)
        {
        System.out.print(arr[i]+" ");
        }
        System.out.println();

        //Function calling
        sortzerosandones(arr);
        System.out.println("Sorted array is ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}