import java.util.*;
class subsequences
{
    static void subsequence(String s,String ans)
    {
        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }
        char curr=s.charAt(0);
        String remstr=s.substring(1);
        subsequence(remstr,ans);
        subsequence(remstr,curr+ans);
    }
    static ArrayList<String> SSQ(String s)
    {
        ArrayList <String> ans=new ArrayList<>();
        
        //base case
        if (s.length() == 0) {
            ans.add("");
            return ans;
        }
        char cc=s.charAt(0);

        //rec work
        ArrayList<String> subsq=SSQ(s.substring(1));

        //self work
        for(int i=0;i< subsq.size();i++)
        {
            String sub=subsq.get(i);
            ans.add(sub);
            ans.add(cc + sub);
        }
        return ans;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
        String s=sc.nextLine();
       System.out.print(SSQ(s));
       subsequence(s, "");
    }
}