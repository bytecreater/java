public class Delete_nth_Node {
    Node head;
    private int size;
    class Node {
        int data;
        Node next;

        Node (int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void insert(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void Delete(int n){
        int size = getsize();
        if (n == size) {
            head = head.next;
            size--;
            return;
        }
    
        int x = (size - n);
        Node tempNode = head;
        for (int i = 1; i < x; i++){
            tempNode = tempNode.next;
        }
        
        tempNode.next = tempNode.next.next;
        size--;
    }

    public int getsize(){
        return size;
    }

    public void Print(){
        if (head == null){
            return;
        }
        Node tempNode = head;
        while(tempNode != null){
            System.out.print(tempNode.data + "->");
            tempNode = tempNode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        Delete_nth_Node list = new Delete_nth_Node();
        list.insert(5);
        list.insert(4);
        list.insert(3);
        list.insert(2);
        list.insert(1);
        list.Print();
        System.out.println(list.getsize());
        list.Delete(3);
        list.Print();

    }
    
}
