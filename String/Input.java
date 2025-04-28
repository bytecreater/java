import java.util.*;
public class Input {
    public static void main(String[] args) {

        //Strings are immutable
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Your name is : " + name);
         
        //length() function
        System.out.println("Length of the string is : " + name.length());

        //charAt() to go at index of string
        for (int i = 0; i < name.length(); i++){
            System.out.println(name.charAt(i));
        }

        //compareTo() to compare two string
        //if s1 > s2 : +ve value
        //if s1 == s2 : 0
        //if s1 < s2 : -ve value

        String s1 = "Nihal";
        String s2 = "Khan";
        if (s1.compareTo(s2) == 0){
            System.out.println("String are equal");
        }
        else if (s1.compareTo(s2) > 0){
            System.out.println("s1 is greater than s2");
        }
        else {
            System.out.println("s1 is smaller than s2");
        }

        //substring(begining index , ending index)
        String sentence = "My name is Nihal";
        String substr = sentence.substring(11 ,sentence.length());
        System.out.println(substr);
    
    }
    
}
