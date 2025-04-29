// import java.util.*;
// public class RecurrsionBasic {
//     public static void PrintNum(int n){
//         if (n == 0){
//             return ;
//         }
//         System.out.print(n + " ");
//         PrintNum(n-1);
//     }
//     public static void main(String[] args) {
//         //Print numbers from 5 to 1
//         int n = 5;
//         PrintNum(n);
//     }
    
// }

//Print number from 1 to 5
// import java.util.*;
// public class RecurrsionBasic {
//     public static void PrintNum(int n){
//         if (n > 5 ){
//             return ;
//         }
//         System.out.print(n + " ");
//         PrintNum(n+1);
//     }
//     public static void main(String[] args) {
//         //Print numbers from 1 to 5
//         int n = 1;
//         PrintNum(n);
//     }
    
// }

//Print sum of first n natural numbers
// import java.util.*;
// public class RecurrsionBasic {
//     public static void PrintNum(int n , int sum){
//         if (n == 0){
//             System.out.println(sum);
//             return ;
//         }
//         sum = sum + n;
//         PrintNum(n-1,sum);
//     }
//     public static void main(String[] args) {
//         //Print sum of n natural numbers
//         Scanner sc = new Scanner(System.in);
//         System.out.print("n : ");
//         int n = sc.nextInt();
//         int sum = 0;
//         PrintNum(n,sum);
//     }
// }

//Print factorial of n
// import java.util.*;
// public class RecurrsionBasic {
//     public static void PrintNum(int n , int fac){
//         if (n == 0){
//             System.out.println(fac);
//             return ;
//         }
//         fac = fac * n;
//         PrintNum(n-1,fac);
//     }
//     public static void main(String[] args) {
//         //Print factorial of n
//         Scanner sc = new Scanner(System.in);
//         System.out.print("n : ");
//         int n = sc.nextInt();
//         int fac = 1;
//         PrintNum(n,fac);
//     }
// }

//print fibonacci series up to n terms
// import java.util.*;
// public class RecurrsionBasic {
//     public static void PrintNum(int fib1,int fib2 ,int n){
//         if (n == 0){
//             return ;
//         }
//         int fib = fib1 + fib2;
//         System.out.print(fib + " ");
//         // fib1 = fib2;
//         // fib2 = fib;
//         PrintNum(fib2, fib,n-1);
//     }
//     public static void main(String[] args) {
//         //Print sum of n natural numbers
//         Scanner sc = new Scanner(System.in);
//         System.out.print("n : ");
//         int n = sc.nextInt();
//         int fib1 = 0;
//         int fib2 = 1;
//         System.out.print(fib1 + " ");
//         System.out.print(fib2 + " ");
//         PrintNum(fib1,fib2,n-2);//because we already printed 2 values
//     }
// }

//print X^n value complexity O(n)
// import java.util.*;
// public class RecurrsionBasic {
//     public static void PrintNum(int n, int x,int res){
//        if (n == 0){
//         System.out.println(res);
//         return;
//        }
//        res = res*x;
//        PrintNum(n-1, x, res);
//     }
//     public static void main(String[] args) {
//         //Print sum of n natural numbers
//         Scanner sc = new Scanner(System.in);
//         System.out.print("n : ");
//         int n = sc.nextInt();
//         System.out.print("x : ");
//         int x = sc.nextInt();
//         int res = 1;
//         PrintNum(n,x,res);
//     }
// }

//print X^n value complexity O(log(n))
import java.util.*;
public class RecurrsionBasic {
    public static int PrintNum(int x, int n){
       if (n == 0){
        return 1 ;
       }

       int half =PrintNum(x, n/2);

       if (n % 2 == 0){
        return half*half;
        
       }
       else{
        return x*half*half;
       }
    }
    public static void main(String[] args) {
        //Print sum of n natural numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("n : ");
        int n = sc.nextInt();
        System.out.print("x : ");
        int x = sc.nextInt();
        int res = PrintNum(x,n);
        System.out.println(res);
    }
}


