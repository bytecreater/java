import java.util.*;
public class InsertionSort {
    public static void Display(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {7,8,3,4,1};
        //Insertion Sort
        //for unsoreted
        for (int i = 1; i < arr.length; i++){
            int current = arr[i];
            //for sorted
            int j = i-1;
            while(j >= 0 && current < arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            //placement
            arr[j+1] = current;
        }
        Display(arr);
    }
    
}
