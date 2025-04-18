import java.util.Scanner;
public class lastindex
    {
        public static void main(String[] args)
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n =sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the elements of the array ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to know the last index ");
        int element=sc.nextInt();
        for (int i =arr.length-1 ;i>=0;i--){
            if(arr[i]==element)
            {
                System.out.println("last index is");
                System.out.println(i);
                break;
            }
        }
    }
}