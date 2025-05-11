import java.util.*;
public class ArrayLists {
    public static void main(String[] args) {
        //initialization
        ArrayList<Integer> list = new ArrayList<>();

        //add() to add at the end 
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);

        //to print arraylist
        System.out.println(list);

        //get() to get an element at index i
        int element = list.get(2);
        System.out.println(element);

        //add(i , el) to add element in between
        list.add(0,4);
        System.out.println(list);

        //set(i , el) to set element]
        list.set(1,5);
        System.out.println(list);

        //remove() to delete element
        list.remove(1);
        System.out.println(list);

        //size() to get size of an arraylist
        int size = list.size();
        System.out.println(size);

        //loop
        for (int  i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
    
}

