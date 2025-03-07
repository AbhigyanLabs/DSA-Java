import java.util.*;
public class frequency{
public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
    int count=0;
    System.out.println("Enter the size of array ");
    int n = sc.nextInt();
    int [] arr= new int[n] ;
    System.out.println("Enter the elements of the array");
    for (int i=0; i<arr.length; i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter the element to check the frequency : ");
    int ele=sc.nextInt();
    for(int i=0; i<n; i++)
    {
        if(arr[i]==ele)
        {
         count=count+1;
        }
    }
    if(count!=0){
        System.out.println("The frequency of the element is "+count);
    }
    else{
        System.out.println("Element do not exist ");
    }
}
}