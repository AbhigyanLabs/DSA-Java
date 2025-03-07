import java.util.*;
class lexicographical
{
    static void lexicographical(String []fruits)
    {
        int n=fruits.length;
        for(int i=1; i<n; i++)
        {
            int minidx=i;
            for(int j=i+1; j<n; j++)
            {
                if(fruits[j].compareTo(fruits[minidx]) <0)
                {    //fruits[j].compareTo(fruits[minIdx]) < 0
                minidx=j;
                }
            }
            //swap
            String temp=fruits[i];
            fruits[i]=fruits[minidx];
            fruits[minidx]=temp;
        }
    }



//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number of fruits");
//         int n=sc.nextInt();
//            sc.nextLine();
//         String arr[]=new String[n];
//         System.out.print("Enter the names of fruits");
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=sc.nextLine();
//         }
//         lexicographical(arr);
//         System.out.print(Arrays.toString(arr));
//     }
// }




public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of fruits
        System.out.print("Enter the number of fruits: ");
        int n = sc.nextInt();
        
        // Consume the newline character left by nextInt()
        sc.nextLine();

        // Initialize the array of strings
        String[] arr = new String[n];

        // Input the fruit names
        System.out.println("Enter the names of the fruits: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        // Perform lexicographical sort
        lexicographical(arr);

        // Display the sorted array
        System.out.println("Sorted fruits in lexicographical order: ");
        System.out.println(Arrays.toString(arr));
    }
}