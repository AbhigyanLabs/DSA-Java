import java.util.*;
class Hashset{
    public static void main(String[] args) {
        HashSet<String> st=new HashSet<>();
        st.add("Travis");
        st.add("Scott");
        st.add("Arun");
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.contains("James"));
        st.remove("Arun");
        System.out.println(st);        
    }
}