import java.util.*;
class arrayprint
{
        static void printarray(int arr[],int idx)
        {
            //Base case
            if(idx==arr.length) return;

            //self work
            System.out.print(arr[idx]+" ");

            //subproblem
            printarray(arr,idx+1);
        }
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the number in the array");
            int n=sc.nextInt();
            int []arr=new int[n];
            for(int i=0;i<n;i++)
            {
            arr[i]=sc.nextInt();
            }
            printarray(arr,0); 
        }
} 