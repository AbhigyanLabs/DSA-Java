import java.util.*;
public class pascalstriangle 
{
    static int[][] pascal(int n)
    {
        int[][] ans=new int[n][];
        for(int i=0;i<n;i++)
        {
            ans[i]=new int[i+1];
            ans[i][0]=ans[i][i]=1;
            for(int j=1;j<i;j++)
            {
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows of pascals triangle");
        int n=sc.nextInt();
        int [][] arr=pascal(n);
        System.out.println("The pascals triangle of "+n+" length is ");
        {
            for(int i=0;i<n;i++)
            {
                //arr[i].length because in a jagged array each row has different numbers of columns.
                for(int j=0;j<arr[i].length;j++)
                { 
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }    
}
