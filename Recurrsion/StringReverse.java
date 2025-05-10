import java.util.*;
public class StringReverse {
    public static void PrintRev(String str , int idx) {
        if (idx == 0){
            System.out.println(str.charAt(idx));
            System.out.println("* End *");
            return;
        }
        System.out.print(str.charAt(idx));
        PrintRev(str , idx-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        int idx = str.length()-1;
        PrintRev(str , idx);
        sc.close();
    }
}