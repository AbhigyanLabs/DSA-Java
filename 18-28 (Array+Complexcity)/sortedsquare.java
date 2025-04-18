//The array provided must be in an ascending order//

import java.util.*;
public class sortedsquare 
{
    // static void swap(int arr[],int i,int j)
    // {
    //     int temp=arr[i];
    //     arr[i]=arr[j];
    //     arr[j]=temp;
    // }

    // static void reverse(int arr[])
    // {
    //     int i=0;
    //     int j=arr.length-1;
    //     swap(arr,i,j);
    //     i++;
    //     j--;
    // }

    static int[] sortsquare(int arr[])
    {
        int n=arr.length;
        int left=0;
        int right =arr.length-1;
        int ans[]=new int[n];
        int k=0;

            while(left<=right)
            {
                if(Math.abs(arr[left]) > Math.abs(arr[right]))
                {
                    ans[k++]=arr[left]*arr[left];
                    left++;
                }
                else
                {
                    ans[k++]=arr[right]*arr[right];
                    right--;
                }
            }
            
        return ans;
    }

public static void main(String[] agrs)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int n=sc.nextInt();
    System.out.println("Enter the elements of the array");
    int [] arr=new int[n];
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.println("The original array is ");
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
    }
    
    //Function calling

    int ans[]=sortsquare(arr);
    System.out.println();
    System.out.println("The sorted square array is");
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(ans[i]+" ");
    }
}
}