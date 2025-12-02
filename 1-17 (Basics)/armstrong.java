import java.util.Scanner;

class armstrong
{
    static boolean armstrong(int n) {
        double arm = 0;
        int temp = n;
        while(n>0) {
            int l = n%10;
            arm = arm + Math.pow(l, 3);
            n = n/10;
        }

        if(temp == (int)arm) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        if(armstrong(n)){
            System.out.println("Armstrong no.");
        }
        else {
            System.out.println("Not a Armstrong number");
        }
    }
}