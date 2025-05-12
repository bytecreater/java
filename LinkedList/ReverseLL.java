public class ReverseLL {
    Node head;
    class Node {
        int data;
        Node next;
        Node prev;
    
        Node (int data){
            this.data =data;
            this.next = null;
            this.prev = null;


    }
}

    public void AddFirst(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //reverse by recursive method
    public Node Recursive(Node head){
        if (head == null || head.next == null){
            return head;
        }
        Node newHead = Recursive(head.next);
            head.next.next = head;
            head.next = null;

            return newHead;
        
    }
    //by iterative method
    public void Reverse(){
        if (head == null || head.next == null){
            return;
        }
        Node currNode = head.next;
        Node prevNode = head;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }


    public void PrintLL(){
        Node tempNode = head;
        if (head == null){
            System.out.println("List is empty");
            return;
        }

        while (tempNode != null){
            System.out.print(tempNode.data + "->");
            tempNode = tempNode.next;
        }
        System.out.print("NULL");
    }
        public static void main(String[] args) {
            ReverseLL list = new ReverseLL();
            list.AddFirst(5);
            list.AddFirst(4);
            list.AddFirst(3);
            list.AddFirst(2);
            list.AddFirst(1);
            list.PrintLL();
            System.out.println();
            // list.Reverse();
            list.head = list.Recursive(list.head);
            
            list.PrintLL();

            
        }
        
    }
