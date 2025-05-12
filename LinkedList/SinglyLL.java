public class SinglyLL {
    Node head;
    private int size;
    class Node {
        String data;
        Node next;

        Node (String data){
            this.data = data;
            this.next = null;
            size++;
        }

    }

    //to add first toward head
    public void AddFirst(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }  

    //to add last of linkedlist
    public void Addlast(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }

        Node tempNode = head;
        while(tempNode.next != null){
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
    }

    //To delete first node
    public void DeleteFirst(){
        if (head == null){
            System.out.print("List is empty");
        }
        size--;
        Node tempNode = head;
        head = tempNode.next;
    }

    //To delete the last node
    public void DeleteLast(){
        if (head == null){
            System.out.print("list is empty");
        }
        size--;
        if (head.next == null){
            head = null;
        }
        Node tempNode = head;
        while(tempNode.next.next != null){
            tempNode = tempNode.next;
        }
        tempNode.next = null;
    }

    //to get size
    public int getSize(){
        return size;
    }

    public void PrintLL(){
        Node tempNode = head;
        if (head == null){
            System.out.print("List is empty");
            return;
        }
        while(tempNode != null ){
            System.out.print(tempNode.data + " -> ");
            tempNode = tempNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        SinglyLL list = new SinglyLL();
        list.AddFirst("Khan");
        list.AddFirst("am");
        list.AddFirst("I");
        list.Addlast("Nihal");
        list.Addlast("Ahemad");
        list.Addlast("Kadar");
        list.DeleteFirst();
        list.DeleteLast();
        list.PrintLL();
        System.out.println(list.getSize());
        list.Addlast("Kadar");
        list.AddFirst("I");
        list.PrintLL();
        System.out.println(list.getSize());

    }
    
}
