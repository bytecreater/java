import java.util.ArrayList;

public class StackArrList {
    static class Stack {
        ArrayList<Integer> list = new ArrayList<>();
        
        public void push(int data){
            if (list.size() == 0){
                list.add(data);
                return;
            }
            list.add(data);
        }

        public void pop(){
            if (list.size() == 0){
                System.out.println("Stack is empty");
                return;
            }
            list.remove(list.size() - 1);
        }

        public void peek(){
            if (list.size() == 0){
                System.out.println("Stack is empty");
                return;
            }
            System.out.println(list.get(list.size()-1));
        }

    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        
        while (s.list.size() != 0){
            s.peek();
            s.pop();
        }
    }
}
