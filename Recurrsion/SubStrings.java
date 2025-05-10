// public class SubStrings{
//     public static void Substring(String str, int idx , String newString){
//         if (idx == str.length()){
//             System.out.println(newString);
//             return;
//         }
//         char currChar = str.charAt(idx);
//         //to be in
//         Substring(str , idx+1 , newString+currChar);
//         //not in
//         Substring(str, idx+1, newString);
//     }
//     public static void main(String[] args) {
//         String str = "abc";
//         Substring(str , 0 ,"");
//     }
// }

//Unique Substrings using HashSet

import java.util.HashSet;

public class SubStrings{
    public static void Substring(String str, int idx , String newString,HashSet<String> set){
        if (idx == str.length()){
            if (set.contains(newString)){
                return;
            }else{
               System.out.println(newString);
               set.add(newString);
               return; 
            }
        }
        char currChar = str.charAt(idx);
        //to be in
        Substring(str , idx+1 , newString+currChar,set);
        //not in
        Substring(str, idx+1, newString,set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet <String> set = new HashSet<>();
        Substring(str , 0 ,"",set);
    }
}