import java.util.*;
class prime {

    static boolean Prime(int n){
        int count = 0;
        for(int i=1; i<=n/2; i++) {
            if(n%i == 0) {
                count++;
            }
        }
        if(count>1) {
            return false;
        }
        else {
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=2; i<n; i++) {
            if(Prime(i)) {
                System.out.println(i);
            }
        }
    }
}
