import java.util.*;
import jdk.jfr.Frequency;
class MostFreq {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }

        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0; i<n; i++) {
            int key=arr[i];
            if(map.containsKey(key)) {
                map.put(key, map.get(key)+1);
            } else{
                map.put(key, 1);
            }
        }
        System.out.print(map);
        int max=-1;
        int ans=-1;

        for(var e: map.entrySet()){
            if(e.getValue()>max)
            {
                max=e.getValue();
                ans=e.getKey();
            }
        }

        // for(var key:map.keySet())
        // {
        //     if(map.get(key) > max)
        //     {
        //         max=map.get(key);
        //         ans=key;
        //     }
        // }
        // System.out.println();
        // System.out.println(ans);
        // System.out.println(max);

        for(var key:map.keySet())
        {
            if(map.get(key) > max)
            {
                max=map.get(key);
                ans=key;
            }
        }
        System.out.println();
        System.out.println(ans);
        System.out.println(max);
    }
}