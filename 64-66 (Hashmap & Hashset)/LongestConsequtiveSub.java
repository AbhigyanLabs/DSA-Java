import java.util.*;
class LongestConsequtiveSub {

    public int longestconsecutive(int[] arr)
        {
            HashSet<Integer> st=new HashSet<>();
            for(int num : arr) st.add(num);
            int maxStreak=0;
            for(int num:st){
                if(!st.contains(num-1))
                {
                    int curr=num;
                    int currStreak=1;
                    while(st.contains(curr+1))
                    {
                        currStreak++;
                        curr++;
                    }
                    maxStreak=Math.max(maxStreak, currStreak);
                }
            }
            return maxStreak;
        }
    }