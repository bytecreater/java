import java.util.Scanner;
import java.util.Random;
public class numbergame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int generate = rand.nextInt(100);
        System.out.println(generate);
        while(true){
            System.out.print("Guess the number btw 0 to 99 : ");
            int guess = sc .nextInt();

            if (guess == generate){
                System.out.println("Congratulations! You guessed the right number!");
                break;
            }
            else if (guess > generate){
                System.out.println("guess is greater than number");
            }
            else{
                System.out.println("guess is lesser than number");
            }
        }



    }
}
