import java.util.*;
public class matrixaddition 
{

    //Function for addition of two array.

    static void add(int arr[][],int r,int c,int arr1[][],int a,int b)
    {
        // if(r>a && c>b)
        // {
        //     int ans[][]=new int[r][c];
        // }
        // if(r<a && c<b)
        // {
        //     int ans[][]=new int[a][b];
        // }
        // if(r>a && c<b)
        // {
        //     int ans[][]=new int[r][b];
        // }
        // if(r<a && c>b)
        // {
        //     int ans[][]=new int[a][c];
        // }
        int ans[][]=new int[r][c];
        if(r==a && c==b)
        {
            for(int i=0;i<a;i++)
            {
                for(int j=0;j<b;j++)
                {
                    for(int k=0;k<a;k++)
                    {
                        for(int l=0;l<b;l++)
                        {
                            if(i==k && j==l)
                            {
                                ans[i][j]=arr[i][j]+arr1[k][l];
                            }
                        }
                    }
                }
            }
            System.out.println("The sum of arrays is");
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    System.out.print(ans[i][j]+" ");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("Wrong Input - Addition not possible between the given array");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner (System.in);

        //Taking size and elements of array form the user.

        System.out.println("Enter the dimensions of the 1st array");
        int r=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Enter the dimensions of the 2nd array");
        int a=sc.nextInt();
        int b=sc.nextInt();

        int arr[][]=new int[r][c];
        int arr1[][]=new int[a][b];

        System.out.println("Enter the elements of the 1st array");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the 2nd array");
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        
        //Function calling

        add(arr,r,c,arr1,a,b);
    }    
}