import java.util.*;
public class matrixmultiplication 
{
    static void multiply(int[][] arr,int a,int b,int arr1[][],int r,int c)
    {
        if(b!=r)
        {
            System.out.println("Matrix multiplication not possible");
        }
        if(b==r)
        {
            System.out.println("Array multiplication possible. ");
            int ans[][]=new int[a][c];
            for(int i=0;i<a;i++)
            {
                for(int j=0;j<c;j++)
                {
                    for(int k=0;k<b;k++)
                    {
                        ans[i][j]+=(arr[i][k]*arr1[k][j]);//
                    }
                }
            }
            System.out.println("The multiplied array is - "+" ");
            for(int i=0;i<a;i++)
            {
                for(int j=0;j<c;j++)
                {
                    System.out.print(ans[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimensions of the 1st array ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter the dimensions of the 2nd array ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Enter the elements of the array 1 ");
        int[][] arr=new int[a][b];
        int[][] arr1=new int[r][c];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the 2nd array ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        multiply(arr,a,b,arr1,r,c);
    }   
}