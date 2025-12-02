import java.util.*;
class practise
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int[] freq=new int[26];

        for(char c: str.toCharArray()){
            freq[c-'a']++;
        }

        int maxodd=0;
        int maxeven=0;

        for(int i=0; i<26; i++) {
            if(freq[i]==0) continue;

            if(freq[i]%2==0 && freq[i]>maxeven){
                maxeven=freq[i];
            }
            if(freq[i]%2!=0 && freq[i]>maxodd){
                maxodd=freq[i];
            }
        }
        System.out.println(maxeven-maxodd);
    }
}