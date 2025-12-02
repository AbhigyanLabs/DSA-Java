import java.util.*;
class removeDuplicates
    {
        static String remDup(String s) {
            HashSet <Character> seen = new HashSet<>();
            StringBuilder res=new StringBuilder();

            for(char c:s.toCharArray()){
                if(!seen.contains(c)) {
                    seen.add(c);
                    res.append(c);
                }
            }
            return res.toString();
        }

        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            // String s=sc.next();
            String s=sc.nextLine();
            System.out.println(remDup(s));
        }
    }