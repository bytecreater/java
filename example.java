import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        StringBuilder sb = new StringBuilder("Nihal khan");
        int arr[] = new int[100];
        int count = 0;
        for (int i = 0; i < sb.length(); i++){
            if (sb.charAt(i) == ' '){
                arr[count] = i;
                count++;
            }
        }
        for (int i = sb.length()-1; i >= 0; i--){
            if (arr[i]== i){
                sb.insert(i,' ');
            }
            System.out.print(sb.charAt(i));
        }
        sc.close();

    }
    
}
