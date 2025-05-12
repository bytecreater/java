public class DoublyLL {
    private Node head;
    private Node tail;
    class Node{
        int data;
        Node next;
        Node prev;

        Node (int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void InsertFirst(int data){
        Node newNode = new Node(data);
        if (head == null){
            tail = head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void InsertLast(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        }

        Node tempNode = head;
        while(tempNode.next != null){
            tempNode =tempNode.next;
        }
        tempNode.next = newNode;
        newNode.next = null;
        tail = newNode;
    }

    //pop_front
    public void RemoveFront(){
        if (head == null){
            return;
        }
        head = head.next;
    }

    //pop_back
    public void RemoveBack(){
        if (head == null){
            return;
        }
        Node tempNode = head;
        while(tempNode.next.next != null){
            tempNode = tempNode.next;
        }
        tail = tempNode;
        tempNode.next = null;
    }

    public void print(){
        Node tempNode = head;
        while(tempNode != null){
            System.out.print(tempNode.data + "->");
            tempNode = tempNode.next;
        }
        System.out.println("NULL");
    }


    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.InsertFirst(2);
        list.InsertFirst(3);
        list.InsertFirst(4);
        list.InsertFirst(5);
        list.InsertFirst(6);
        list.print();
        list.InsertLast(1);
        list.print();
        list.RemoveFront();
        list.print();
        list.RemoveBack();
        list.print();
    }
}
