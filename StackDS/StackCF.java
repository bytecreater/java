import java.util.*;
public class StackCF {
    public static void AddAtBottom(int data, Stack<Integer> s){
        if (s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        AddAtBottom(data, s);
        s.push(top);
    }

    public static void Reverse(Stack<Integer> s){
        if (s.isEmpty()){
            return;
        }
        int top = s.pop();
        Reverse(s);
        AddAtBottom(top, s);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        // AddAtBottom(4 , s);
        Reverse(s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

        // System.out.println();
        // Reverse(s);
        // while(!s.isEmpty()){
        //     System.out.println(s.peek());
        //     s.pop();
        // }

    }
    
}
