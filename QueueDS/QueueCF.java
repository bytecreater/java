import java.util.*;
public class QueueCF {
   /*Queue is interface in Java Collection Framework so its object cannot be created
    So it is implemented using linkedlist or arraydeque
    
    "Both can be used to implement a queue, but ArrayDeque is generally faster and more
     memory-efficient because it's backed by a resizable array. LinkedList uses a doubly
     linked list, so it has more overhead. Also, ArrayDeque doesn’t allow null elements, 
    while LinkedList does. So, for queue operations, ArrayDeque is usually preferred unless 
    I specifically need to store null or do frequent insertions/removals in the middle."*/
    public static void main(String[] args) {
        // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}