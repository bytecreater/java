import java.util.*;
public class SelectionSort {
    public static void Display(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        //Selection Sort
        //selection of smallest element and putting it in front 
        //single swap per iteration
        int[] arr = {7,8,3,1,2};
        for (int i = 0; i < arr.length-1; i++){
            int small = i;
            for (int j = i+1; j < arr.length; j++){
                if (arr[small] > arr[j]){
                    small = j;
                }
            }
            int temp = arr[small];
            arr[small] = arr[i] ;
            arr[i] = temp;
        }
        Display(arr);
    }
    
}
