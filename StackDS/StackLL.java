public class StackLL {
    static class Node {
        int data;
        Node next;

        Node (int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        public static Node head ;
        public Boolean isEmpty(){
            return head == null;
        }

        public void push(int data){
            Node newNode = new Node(data);
            if (isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public void  pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return;
            }
            head = head.next;
        }

        public void peek(){
            if (isEmpty()){
                System.out.println("Stack is empty");
                return;
            }
            System.out.println(head.data);
            return;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        
        while(!s.isEmpty()){
            s.peek();
            s.pop();

        }
    }
}