public class Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Nihal");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        //setCharAt(index , char) to replace character
        sb.setCharAt(1 , 'e');
        System.out.println(sb);

        //insert(index , char) to insert charact