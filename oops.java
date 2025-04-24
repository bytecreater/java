class Pen{
    String color;
    String type;


    public void write(){
        System.out.println("Welcome Nihal to OOPS in Java");
    }

    public void printcolor(){
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public void printinfo(String name){
        System.out.println(name);
    }

    public void printinfo(int age){
        System.out.println(age);
    }

    public void printinfo(String name, int age) {
        System.out.println(name + " " + age);
}
}
public class oops {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Nihal";
        s1.age = 21;
        s1.printinfo();

        s1.printinfo("Zubair" , 25);
    }
    
}
