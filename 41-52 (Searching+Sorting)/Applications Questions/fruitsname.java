import java.util.*;
class fruitsname
{
    static void sortfruits(String[] fruits)
    {
        int n=fruits.length;
        for(int i=0; i<n-1; i++)
        {
            int minidx = i;
            for(int j=i+1; j<n; j++)
            {
                if(fruits[j].compareTo(fruits[minidx]) < 0)
                {
                    minidx=j;
                }
            }
            String temp=fruits[i];
            fruits[i] = fruits[minidx];
            fruits[minidx]=temp;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size and String");
        int n=sc.nextInt();
        String[] fruits=new String[n];
        
        System.out.println("Enter the names of the fruits: ");
        for (int i = 0; i < n; i++) 
        {
            fruits[i] = sc.nextLine();
        }
        sortfruits(fruits);

        System.out.println("Sorted fruits in lexicographical order: ");
        System.out.println(fruits);
    }
}