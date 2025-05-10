public class MoveAllX {
    public static void MoveAllx(String str, int idx,int count,String newString){
        char currChar = 'x';
        if (idx == str.length()){
            for  (int i = 0 ; i < count; i++){
                newString += currChar;
            }
            System.out.println(newString);
            return;
        }
        if (str.charAt(idx) == currChar){
            count++;
        }
        else{
            newString += str.charAt(idx);
        }
        MoveAllx(str ,idx+1, count , newString);

    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        MoveAllx(str, 0, 0,"");
        
    }
    
}
