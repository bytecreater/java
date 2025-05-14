public class QueueLL {
    static Node head;
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
                head = newNode;
            }
            Node tempNode = head;
            while(tempNode.next != null){
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
            newNode.next = null;
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

        Node tempNode = head;
        while(tempNode != null){
            System.out.println(q.peek());
            q.remove();
            tempNode = tempNode.next;
        }
    }
}
