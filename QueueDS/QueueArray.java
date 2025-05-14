public class QueueArray {
    public static class Queue {
        int arr[];
        int rear = -1;
        int size;

            Queue(int size){
                arr = new int[size];
                this.size = size;
            }
    

    public boolean isEmpty() {
        return rear == -1;
    }

    //Enque 0r Add
    public void Add(int data){
        if (rear == size - 1){
            System.out.println("Queue is Full");
            return;
        }
        rear++;
        arr[rear] = data;
    }

    //Remove or Enqueue
    public void remove(){
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        int front = arr[0];
        for (int i = 0; i < rear; i++){
            arr[i] = arr [i+1];
        }
        rear--;
}

//peek
public int peek(){
    if (isEmpty()){
        System.out.println("Queue is Empty");
        return -1; 
    }
    return arr[0];
}
    }
    public static void main(String[] args) {
        Queue q = new Queue(10);
        q.Add(1);
        q.Add(2);
        q.Add(3);
        q.Add(4);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
    
}
