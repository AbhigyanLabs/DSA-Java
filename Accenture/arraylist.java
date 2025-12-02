import java.util.*;
class arraylist {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println(list.get(0));
        System.out.println(list.contains(0));
        System.out.println(list.size());
        System.out.println(list.get(0));

        list.set(3, 30);
        list.remove(1);
        list.remove(Integer.valueOf(5));
        list.clear();

        System.out.println(Arrays.toString(list.toArray()));
    }
}
