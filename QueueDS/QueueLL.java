public class QueueLL {
    static Node head;
    static Node tail;
    public class Node {
        int data ;
        Node next;

        Node (int data){
            this.data = data;
            this.next = null;
        }
    }

        public void Add(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public void remove(){
            if (head == null){
                System.out.println("Queue is empty");
                return;
            }
            head = head.next;
        }

        public int peek(){
            if (head == null){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }



    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        q.Add(1);
        q.Add(2);
        q.Add(3);
        q.Add(4);
        q.remove();
        System.out.println(q.peek());

        Node tempNode = head;
        while(tempNode != null){
            System.out.println(q.peek());
            q.remove();
            tempNode = tempNode.next;
        }
    }
}
