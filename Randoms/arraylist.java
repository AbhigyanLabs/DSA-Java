import java.util.*;
class arraylist
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the data");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the arraylist");
        ArrayList <Integer> al=new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            al.add(sc.nextInt());
        }
        System.out.println(al);
    }
}

