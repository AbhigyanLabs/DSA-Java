import java.util.*;
class String{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        Char[] arr=s.toCharArray();

        String[] words=new String[arr.length];
        int wcount=0;

        String temp="";
        for(char c:arr){
            if(c != ' ') {
                temp +=c;
            } else {
                if(!temp.isEmpty()) {
                    words[wcount++]=temp;
                    temp= "";
                }
            }
        }
        if(!temp.isEmpty()) {
                    words[wcount++]=temp;
        }
        
    }
}