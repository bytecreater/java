public class CircularQueue {
    static class CQueue {
        int arr[];
        int rear = -1;
        int size;
        int front = -1;
        CQueue (int size){
            arr = new int[size];
            this.size = size;
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public boolean isFull(){
            return (rear + 1) % size == front;
        }

        //add
        public void Add(int data){
           if (isFull()){
            System.out.println("The Queue is Full");
            return;
           }
           //for 1st element
           if(isEmpty()){
            front = rear = 1;
           }else{
            rear = (rear + 1) % size;
           }
           arr[rear] = data;
        }

        //remove
        public void remove(){
           if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
           }
           if(rear == front){
            rear = front = -1;
           }else {
            front = (front + 1) % size;
           }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    }

    public static void main(String[] args) {
        CQueue q = new CQueue(4);
        q.Add(1);
        q.Add(2);
        q.Add(3);
        q.Add(4);
        q.remove();
        q.Add(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }    
}
