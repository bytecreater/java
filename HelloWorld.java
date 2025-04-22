import java.util.Arrays;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        // string
        String name = "Nihal";
        System.out.println("Hello " + name + "!");

        // lenght = to know length of the string        System.out.println(name.length());
        String name1 = "Nihal";
        String name2 = "Khan";
        String name3 = name1 + " " +  name2;
        System.out.println(name3);

        //charAt = to know character at perticular index
        System.out.println("First character of name: " + name.charAt(0));

        //replace = to replace char
        String name4 = name.replace("i" , "e");
        System.out.println("Name after replacement: " + name4);

        //substring = to take substring from string
        String s1 = "abcdefgh";
        String s2 = s1.substring(0,4);
        System.out.println(s2);

        //Array
        int[] marks = new int[3];
        marks[0] = 105;
        marks[1] = 95;
        marks[2] = 100;
        System.out.println(marks[2]);
        System.out.println(marks.length);

        //sort 
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

        //if we knew what to store so dont need to use new keyword
        int[] score = {50, 20, 99, 40};
        System.out.println(score[1]);

        //2D Array
        int[][] finalmarks = {{50,60,70,80},{10,20,30,40}};
        System.out.println(finalmarks[1][2]);

        //casting = 1.implicit (double + int)
        // 2. explicit (int + (int)double )

        // Type casting example = Implicit it is allowed by java
        double price = 100.00;
        double finalprice = price + 18;
        System.out.println(finalprice);

        // Type casting example = Explicit it requires a cast
        int quantity = 100;
        int finalQuantity = quantity + (int)18.00;
        System.out.println(finalQuantity);

        //final = to make value constant
        final float pi = 3.14F;
        System.out.println(pi);

        //operators
        int a = 10;
        int b = 20;
        int sum = a + b;
        int diff = b - a;
        int mul = a * b;
        int div = b / a;
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + mul);
        System.out.println("Division: " + div);

        int modulus = b % a; // gives reminder od division
        System.out.println(modulus);

        //uniary operators  ++.--
        System.out.println("unary operators");
        System.out.println("++");
        int num = 5;
        System.out.println(num++);
        System.out.println(num);

        int num2= 7;
        System.out.println(++num2);
        System.out.println(num2);

        System.out.println("--");
        int num3 = 10;
        System.out.println(num3--);
        System.out.println(num3);

        int num4 = 3;
        System.out.println(--num4);
        System.out.println(num4);

        //Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Your age is: " + age);

        //next = take word as input
        System.out.print("Enter your name: ");
        String name6 = sc.next();
        System.out.println("Your name is: " + name6);

        //nextLine = take line of string as input
        System.out.print("Enter your full name : ");
        String fullname = sc.nextLine();
        System.out.println(fullname);


















































    }
}
