class NextGreater {
    public static void main(String[] args) {

        //USING ARRAY
        int[] arr={2,3,4,5,3,4,7,5,94,3,5,63,6,4};
        int[] res=new int[arr.length];
        for(int i=0; i<arr.length;i++)
        {
            res[i]=-1;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]<arr[j]) {
                res[i]=arr[j];
                break;
                }
            }
        }
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(res[i]+" ");
        }



        //USING STACKS
        
    }
}