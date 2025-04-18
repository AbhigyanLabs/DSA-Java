   import java.util.*;
   class squareroot
   {
    static int squareroot(int n)
    {
        int st=0;
        int end=n;
        int ans=-1;
        while(st<=end)
        {
            int mid=st+(end-st)/2;
            int val=mid*mid;

            if(val == n) return mid;
            else if(val > n)
            {
                end=mid-1;
            }
            else
            {
                ans=mid;
                st=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int ans = squareroot(n);
        System.out.println("The answer is "+ans);
    }
   }