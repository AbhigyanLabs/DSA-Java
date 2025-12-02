import java.util.*;
class fruit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        int[] freq=new int[26];
        for(char c: s.toCharArray()) {
            freq[c-'a']++;      //c - 'a' converts a letter into an index
        }
        int maxeven=0;
        int maxodd=0;

        for(int i:freq){
            if(i==0) continue;

            if(i%2==0) {
                maxeven=i;
            } else {
                maxodd=i;
            }
        }

        System.out.println(Math.abs(maxeven-maxodd));
        System.out.print(maxeven-maxodd);
    }
}