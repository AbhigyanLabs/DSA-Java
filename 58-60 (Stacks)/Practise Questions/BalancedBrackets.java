import java.util.*;
class BalancedBrackets {
    static boolean Balance(String s){
        Stack<Character> st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else{
                if(st.isEmpty()) return false;
                if(st.peek()=='(') st.pop();
            }
        }
        if(st.size()>0) return false;
        else return true;
    }

    static int Minimum(String s)
    {
        //Complete it
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String to be checked");
        String str=sc.nextLine();
        System.out.println(Balance(str));
        int count = Minimum(str);
        System.out.println("The minimum number of brackets to be removed are: "+Minimum);
    }
}