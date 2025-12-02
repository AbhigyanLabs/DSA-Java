class   Overloading
{
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;  
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30};
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 30) {
                swap(arr, i, 0);
            }
        }
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
    }
}