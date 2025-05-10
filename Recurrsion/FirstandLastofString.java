public class FirstandLastofString {
    static int count = 0;
    public static void PrintFirst(String str , char x , int idx){
        if (str.charAt(idx) == x){
            count = idx;
        }
        if (idx == 0){
            System.out.println("First occurance : " + count);
            return;
        }
        PrintFirst(str, x, idx-1);
    }
    public static void PrintLast(String str ,char x ,int idx){
        if (str.charAt(idx) == x){
            System.out.println("Last Occurance : " + idx);
            return;
        }
        PrintLast(str , x , idx-1);
    }
    public static void main(String[] args) {
        String str = "nihalahemadkhan";
        PrintFirst(str, 'a' , str.length()-1);
        PrintLast(str,'a',str.length()-1);
        
    }
}
