import java.util.*;
public class arrayintro {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // int[] marks = new int[3];
        // marks[0] = 10;
        // marks[1] = 30;
        // marks[2] = 50;
        
        // System.out.println(marks[0]);

        // for (int i = 0; i < marks.length ; i++){
        //     System.out.println(marks[i]);
        // }


        int[] numbers = new int[4];
        System.out.print("Enter the numbers: ");
        for (int i =0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
        }     

        System.out.print("Enter the key : ");
        int key = sc.nextInt();

        for (int i = 0; i < numbers.length ; i++){
            if (numbers[i] == key){
            System.out.println("The number " + key + " is located at index "+ i);
            }
        }

}
}
