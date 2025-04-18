class CircularQueue {
    public static class CQueue{

        int front=-1;
        int rear=-1;
        int size=0;
        int[] arr=new int[5];

        public void add(int val){
            if(size == arr.length){
                System.out.println("Queue is full ");
                return;
            }
            
            if(size==0){
                front=rear=0;
                arr[rear]=val;
            }

            else if(rear<arr.length-1){
                arr[++rear]=val;
            }

            else if(rear==arr.length-1){
                rear = 0;
                arr[0]=val;
            }
            size++;
        }

        public int remove() {
            if(size==0) {
                System.out.println("Queue is empty");
                return -1;
            }
            else{
                int val=arr[front];
                if(front==arr.length-1) front=0;
                else front++;
                size--;
                return val;
            }
        }
        
        public int peek() {
            if(size==0) {
                System.out.println("Queue is empty ");
                return -1;
            }
            else return arr[front];
        }
        
        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
        
        public void Display(){
            if(size == 0) {
                System.out.println("Queue is Empty ");
                return;
            }
            else if(front<=rear) {
                for(int i=front ;i<=rear ;i++) {
                    System.out.print(arr[i]+" ");
                }
            }
            else{
                for(int i=front; i<arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i=0;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        CQueue q=new CQueue();
        q.Display();
        q.add(2);
        q.add(4);
        q.add(5);
        q.add(1);
        q.add(8);
        q.add(45); //Q is full
        q.Display();
        q.remove();
        q.Display();
        q.add(65);
        q.Display();
        q.add(156);
        q.Display();
        for(int i=0; i<q.arr.length; i++){
            System.out.print(q.arr[i]+" ");
        }
    }
}