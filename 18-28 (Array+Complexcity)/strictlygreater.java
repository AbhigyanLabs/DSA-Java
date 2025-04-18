import java.util.*;
    public class strictlygreater 
    {
        public static void main(String[] args)
        {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the size of the array ");
                int n=sc.nextInt();
                System.out.println("Enter the elements of the array");
                int [] arr= new int[n];
                int count=0;
                for (int i = 0;i<n;i++)
                {
                        arr[i]=sc.nextInt();
                }
                System.out.println("Enter the element to check");
                int element = sc.nextInt();
                for(int i=0;i<arr.length;i++)
                {
                    if(arr[i]>element)
                    {
                    count = count+1;
                    }
                }
                System.out.println("The number of elements strictly greater then "+ element + " are " + count);
            }
    }