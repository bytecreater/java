import java.util.*;
public class TwoDarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Dimensions");
        System.out.print("rows : ");
        int rows = sc.nextInt();
        System.out.print("columns : ");
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("--------");

        System.out.print("Enter the key : ");
        int key = sc.nextInt();
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                if (matrix[i][j] == key){
                    System.out.print("row : " + i + " col :  " + j);
                    System.out.println();
                }
            }
        }
        System.out.print("--------");
    }
    
}
