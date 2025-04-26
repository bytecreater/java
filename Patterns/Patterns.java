import java.util.*;

public class Patterns {
    public static void main(String[] args) {
        // Solid Rectangle
        // Scanner sc = new Scanner(System.in);
        // System.out.print("n : ");
        // int n = sc.nextInt();
        // System.out.print("m : ");
        // int m = sc.nextInt();
        // for (int i = 0; i < n; i++){
        //     for (int j = 0; j < m; j++){
        //         System.out.print(" *");
        //     }
        // System.out.println("");
        // }

        //Hollow Rextangle
        // 
        
        //Half Pyramid
        // Scanner sc = new Scanner(System.in);
        // System.out.print("n : ");
        // int n = sc.nextInt();

        // for(int i = 1; i <= n; i++){
        //     for (int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        //Inverted Half Pyramid
        // Scanner sc = new Scanner(System.in);
        // System.out.print("n : ");
        // int n = sc.nextInt();
        // for (int i = 0; i < n; i++){
        //     for (int j = n; j > i; j--){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        //Inverted half Pyramid
        // Scanner sc = new Scanner(System.in);
        // System.out.print("n : ");
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++){
        //     for (int j = 1; j <= n; j++){
        //         if (j <= n - i){
        //             System.out.print(" ");
        //         }
        //         else {
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println("");
        // }

        // number pyramid
        // Scanner sc = new Scanner(System.in);
        // System.out.print("n : ");
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i ++){
        //     for (int j = 1; j <= i; j ++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // Inverted number pyramid
        // Scanner sc = new Scanner(System.in);
        // System.out.print("n : ");
        // int n = sc.nextInt();
        // for (int i = n; i >= 1; i--){
        //     for (int j = 1; j <= i; j ++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        //Continuous Number Pyramid
        // number pyramid
        // Scanner sc = new Scanner(System.in);
        // System.out.print("n : ");
        // int n = sc.nextInt();
        // int count = 1;
        // for ( int i = 1; i <= n; i++){
        //     for (int j = 1; j <= i; j++){
        //         System.out.print(count);
        //         count++;
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }

        //Pyramid of 101010
        // Scanner sc = new Scanner(System.in);
        // System.out.print("n : ");
        // int n = sc.nextInt();
        // int num = 1 ;
        // for (int  i = 1; i < n; i++){
        //     for (int j = 1; j <= i; j++){
        //         System.out.print(num);
        //         if (num == 0){
        //             num++ ;
        //         }
        //         else {
        //             num--; 
        //         }
        //     }
        //     System.out.println();
        // }

        // Butterfly pattern
//         Scanner sc = new Scanner(System.in);
//         System.out.print("n : ");
//         int n = sc.nextInt();
//         for (int i = 1; i <= n; i++){
//             for (int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             for (int k = i; k < (2*n) - i; k++){
//                 System.out.print(" ");
//             }
//             for (int l = 1; l <= i; l++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         for (int i = n; i >= 1; i--){
//             for (int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             for (int j = i; j < (2*n) - i; j++){
//                 System.out.print(" ");
//             }
//             for (int j = i; j >= 1; j--){
//                 System.out.print("*");
//             }
//             System.err.println();
//         }

        // Solid Rhombus
        // Scanner sc = new Scanner(System.in);
        // System.out.print("n : ");
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++){
        //     for (int j = n; j >= i; j--){
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j<= i; j++){
        //         System.out.print("*");
        //     }
        //     for (int j = n; j > i; j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Number pyramid
        // Scanner sc = new Scanner(System.in);
        // System.out.print("n : ");
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++){
        //     for  (int j = n; j > i; j--){
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= i; j++){
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }

        // Palindrome Pattern
        // Scanner sc = new Scanner(System.in);
        // System.out.print("n : ");
        // int n = sc.nextInt();
        // for (int i = 1; i < n; i++){
        //     for (int j = n; j > i; j--){
        //         System.out.print("  ");
        //     }
        //     for (int  j = i; j >= 1; j--){
        //             System.out.print(j + " ");
        //     }
        //     for (int j = i; j > 1; j--){
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

        //Diamond Pattern
        Scanner sc = new Scanner(System.in);
        System.out.print("n : ");
        int n = sc.nextInt();
        for (int i = 1; i < n; i++){
            for (int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*" + " ");
            }
            for (int j = 1; j < i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++){
            for (int j = 1; j < i; j++){
                System.out.print("  ");
            }
            for (int j = n; j > i; j--){
                System.out.print("*" + " ");
            }
            for (int j = n; j >= i; j--){
                System.out.print("*" + " ");
            }
            System.out.println();
        }


    
    }
    
}
