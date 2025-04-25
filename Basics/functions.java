public class functions {

    public static void printname(){
        System.out.println("Nihal");
    }

    public static void printsum(int a ,int b){
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    public static void printmore(String name ,int num){
        for (int i = 0; i < num; i++){
            System.out.println(name);
        }
    }
    public static void main(String[] args) {
     printname();
     printsum(10, 20);
     printmore("khan", 5);
        



    }
}
