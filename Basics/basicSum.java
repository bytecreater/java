package Basics;
import java.util.*;
public class basicSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b ;
        System.out.print("a : ");
        a = sc.nextInt();
        System.out.print("b : ");
        b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum : " + sum);
    }
}
