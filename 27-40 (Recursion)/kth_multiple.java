import java.util.*;
class kth_multiple
{
    static void kmul(int num,int k)
    {

        //base case
        if(k==0)                                                      //remember the order
        return;
        
        //recursive work
        kmul(num,k-1);

        //self work
        System.out.print(num*k);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number and the number of multiples");
        int num=sc.nextInt();
        int k=sc.nextInt();
        kmul(num,k);
    }
}


//Note:-The order of the recursion calling is shown in this problem. If we do recursive work efore the 
//self work then the code will not give the correct answer bcause the self work wil print the last element
//of the series & for that it needs to know thw value of k-1 multiple which is being calculated by the 
// recursive function. 