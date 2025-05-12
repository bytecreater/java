import javax.security.auth.PrivateCredentialPermission;

public class CircularLL {
    private Node head;
    private Node tail;
    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //insert at head
    public void InsertAtHead(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        tail.next = head;
    }

    //insert at tail
    public void InsertAtTail(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = tail = newNode;
            return;
        }
        Node tempNode = head;
        while(tempNode.next != head){
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
        tail = newNode;
        tail.next = head;
    }

    //remove at head
    public void RemoveAtHead(){
        if (head == null){
            return;
        }
        head = head.next;
        tail.next = head;
    }

    //delete at tail
    public void RemoveAtTail(){
        if (head == null){
            return;
        }
        Node tempNode = head;
        while (tempNode.next.next != head){
            tempNode = tempNode.next;
        }
        tempNode.next = head;
        tempNode = tail;
        tail.next = head;
    }

    public void Print(){
        Node tempNode = head;
        while(tempNode.next != head){
            System.out.print(tempNode.data + "->");
            tempNode = tempNode.next;
        }
        System.out.println(tempNode.data);
    }
    public static void main(String[] args) {
        CircularLL list = new CircularLL();
        list.InsertAtHead(3);
        list.InsertAtHead(2);
        list.InsertAtHead(1);
        list.InsertAtHead(4);
        list.Print();
        list.InsertAtTail(4);
        list.Print();
        list.RemoveAtHead();
        list.Print();
        list.RemoveAtTail();
        list.Print();

    }
    
}
