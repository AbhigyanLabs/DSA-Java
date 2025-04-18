import java.util.*;
public class querieswithfreq
{
    //making a frequency counting ar
    static int[] makefrequencyarray(int[] arr)
    {
        int freq[]= new int[100005];
        for(int i=0;i<arr.length;i++)
        {
        freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the array size ");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int []freq=makefrequencyarray(arr);
        System.out.println("Enter the number of queries");
        int q=sc.nextInt();
        //Main logic of the program
        while(q>0)
        {
        System.out.println("Enter the number to be searched");
        int val=sc.nextInt();
        {
            if(freq[val]>0)
            {
            System.out.println("Yes");
            }
            else
            {
            System.out.println("NO");
            }
            q--;
        }
    }
}
}