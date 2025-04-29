public class Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Nihal");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        //setCharAt(index , char) to replace character
        sb.setCharAt(1 , 'e');
        System.out.println(sb);

        //insert(index , char) to insert character
        sb.insert(0 , 'I');
        System.out.println(sb);

        //delete(start,end) to delete char or substring
        sb.delete(0,1);
        System.out.println(sb);

        //append('char') to add char at end of string
        sb.append(' ');
        sb.append('K');
        sb.append('h');
        sb.append('a');
        sb.append('n');
        System.out.println(sb);

        //length() to know length of a string
        System.out.println(sb.length());


    }
    
}
