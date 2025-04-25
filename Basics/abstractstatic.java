abstract class Animal{
    abstract void walk();

    Animal(){
        System.out.println("Contructor is called to create animal");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("create horse");
    }
    public void walk() {
        System.out.println("The horse walks gracefully.");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("The chicken walks clumsily.");
    }
}
public class abstractstatic {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();


    }
    
}
