import java.util.*;
public class thirdlargest
{
    static int max(int arr[])
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }


        //Remove the maximum element and it's all copies from the array.
        int max=max(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==max)
            {
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int smax=max(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==smax)
            {
                arr[i]=Integer.MIN_VALUE;
            }
        }

        //now find the the third max
        int tmax=max(arr);
        if(arr.length<=2)
        {
            System.out.println(max);
        }
        else if(tmax==Integer.MIN_VALUE)
        {
            System.out.println(max);
        }
        else
        {
            System.out.println("Third largest is");
            System.out.println(tmax);
        }
    }
}