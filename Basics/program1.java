import java.util.Scanner;
public class program1 {
    public static void main(String[] args) {
    int pen = 10;
    int book = 40;

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the money you have : ");
    int money = sc.nextInt();

    if (money >= pen && money < book){
        System.out.println("You can buy only a pen");
    }
    else if (money >= book && money < book+pen){
        System.out.println("You can buy only a book or pen.");
    }
    else if (money >= book + pen) {
        System.out.println("You can buy both a book and a pen.");
    }
    else {
        System.out.println("You cannot buy anything");
    }


    
        
    }
}
