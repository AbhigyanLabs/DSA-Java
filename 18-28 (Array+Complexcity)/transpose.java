import java.util.*;
public class transpose 
{
    //Can transpose any matrices.
    static int[][] transpose(int[][] arr,int r,int c)
    {
        int ans[][] = new int[c][r];
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
                ans[i][j]=arr[j][i];
            }
        }
        return ans;
    }
    //Can transpose only square matrices.
    static void inplacetranspose(int[][] arr,int r,int c)
    {
        for(int i=0;i<c;i++)
        {
            for(int j=i;j<c;j++)
            {
            int temp=arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;
            }
        }
        System.out.println("The transposed array by swap is ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
            System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimensions of the array");
        int r=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Enter the elements of the array");
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
            arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The original array is ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
            System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int ans[][]=transpose(arr,r,c);
        System.out.println("The transposed array by iteration is ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
            System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
        inplacetranspose(arr,r,c);
    }
}