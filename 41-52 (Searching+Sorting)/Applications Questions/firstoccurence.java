import java.util.*;
class firstoccurence
{
    static int firstoccurence(int arr[], int tar)
    {
        int n=arr.length;
        int st=0;
        int end=n-1;
        int fo=-1;
        
        while(st<=end)
        {
            int mid=st+(end-st)/2;
            if(arr[mid]==tar)
            {
                fo=mid;
                end=mid-1;
            }
            else if(arr[mid]<tar)
            {
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return fo;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the target ");
        int tar=sc.nextInt();
        System.out.print("Enter the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int ans=firstoccurence(arr,tar);
        System.out.print(ans);
    }
}