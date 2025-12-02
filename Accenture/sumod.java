// class sumod
// {
//     static int sod(int n) {
//         int sum=0;
//         while(n>0){
//             sum+=n%10;
//             n=n/10;
//         }
//         return sum;
//     }

//     public static void main(String[] args)
//     {
//         int n=73456;
//         int ans=sod(n);
//         while(ans>9){
//             ans=sod(ans);
//         }
//         System.out.println(ans);
//     }
// }

// class sumod
// {
//     public static void main(String[] args) {
//         String s="abhigyan";
//         int count=0;
//         char[] arr=s.toCharArray();

//         for(int i=0;i<arr.length;i++) {
//             if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' ||arr[i]=='u') {
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }

// class sumod{
//     public static void main(String[] args) {
//         int[] arr={46, 49, 89 ,31 ,45, 544, 21};

//         int max=0;
//         int maxt=0;
//         for(int n:arr) {
//             if(n>max){
//                 max=n;
//             }
//         }

//         for(int i:arr){
//             if(i!=max && i>maxt) {
//                 maxt=i;
//             }
//         }
//         System.out.println(maxt);
//     }
// }

// class sumod
// {
//     public static void main(String[] args) {
//         String s="abhigyan singh";
//         int[] arr=new int[26];

//         for(char c:s.toCharArray()) {
//             if(c == ' ') continue;
//             arr[c-'a']++;
//         }

//         for(int i=0; i<26; i++) {
//             if(arr[i]>0) {
//                 System.out.println((char)(i+'a') + " " + arr[i]);
//             }
//         }
//     }
// }

// import java.util.*;
// class sumod{
//     public static void main(String[] args) {
//         int[] arr={87,45, 54, 89, 32, 97, 641, 122, 87,45, 54, 89, 32, 97, 641, 122};

//         HashSet<Integer> set = new HashSet<>();
//         ArrayList<Integer> list = new ArrayList<>();

//         for(int n:arr){
//             if(!list.contains(n)) {
//                 list.add(n);
//             }
//             set.add(n);
//         }
//         System.out.println(list);
//         System.out.println(set);
//     }
// }

// import java.util.Scanner;

// class sumod {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         StringBuilder sb = new StringBuilder(s);
//         String rev=sb.reverse().toString();

//         if (s.equals(rev)) {
//             System.out.println("Palindrome");
//         } else {
//             System.out.println("Not Palindrome");
//         }
//     }
// }


// import java.util.*;
// class sumod {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         ArrayList<Integer> even = new ArrayList<>();
//         ArrayList<Integer> odd  = new ArrayList<>();

//         for(int i = 0; i < n; i++){
//             int x = sc.nextInt();
//             if(x % 2 == 0) even.add(x);
//             else odd.add(x);
//         }

//         even.addAll(odd);
//         for(int x : even) System.out.print(x + " ");
//     }
// }
