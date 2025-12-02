import java.util.*;
class duplicate {

    static void duplicate(String s) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        Set<Character> key = map.keySet();
        for (char c : key) {
            if (map.get(c) > 1) {
                System.out.println(c + " " + map.get(c));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        duplicate(s);
    }
}
