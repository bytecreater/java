public class BitManupilation {
    public static void main(String[] args) {
        //Getbit of n n = number given
        //step 1 : bitmasking 1<<i  i = position
        //step 2 : bm & n

    //     int n = 5 ; // 0101
    //     int pos = 1;
    //     int BitMask = 1 << pos;
    //     if ((BitMask & n) == 0){
    //         System.out.println("Bit at postion " + pos + " is 0");
    //     }
    //     else {
    //         System.out.println("Bit at position " + pos + " is 1");
    //     }
    // }

    //SetBit to change bit from 0 to 1
    //bit masking
    //BM OR number use of OR operator
    // int n = 7;//0111
    // int pos = 3;
    // int BitMask = 1 << pos;
    // int ans = BitMask | n;
    // System.out.println(ans);

    //ClearBit to change bit from 1 to 0
    //bit masking
    // ~(BitMask) & number (AND with NOT)
    int n = 7;//0111
    int pos = 2;
    int BitMask = 1 << pos;
    int ans = ~(BitMask) & n;
    System.out.println(ans);


    }    
}
