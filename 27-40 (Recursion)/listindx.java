import java.util.*;
class listindx
{
    static ArrayList <Integer> allIndices(int[] arr, int n, int target,int idx)
    {   
        ArrayList<Integer> ans=new ArrayList<Integer>();
        if(idx>=arr.length) return ans;

        if(arr[idx]==target)
        ans.add(idx);
        ArrayList<Integer> smallans=allIndices(arr, n, target,idx+1);

        ans.addAll(smallans);
        return ans;
    }

    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0; i<n ;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.print("Enter the number to be searched");
    int target=sc.nextInt();
    ArrayList<Integer> ans=allIndices(arr, n, target, 0);
    for(Integer i:ans)
    {
        System.out.print(i+" ");
    }
    }
}