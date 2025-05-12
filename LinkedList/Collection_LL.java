import java.util.*;
public class Collection_LL {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        //to add first
        list.addFirst("Khan");
        list.addFirst("Nihal");
        
        //to add last
        list.addLast("Muslim");
        list.add("21"); // add at

        //to get size()
        System.out.println(list.size());

        // to print
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + "->");
        }
        System.out.println("NULL");

        //to delete
        list.removeFirst();
        list.removeLast();
        list.remove(0);
        // list.remove(); to remove first element
        


        System.out.println(list);
    }
    
}
