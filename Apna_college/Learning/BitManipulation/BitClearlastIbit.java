package Apna_College.Learning.BitManipulation;

public class BitClearlastIbit {
    public static void main(String[] args) {
        System.out.print(clearLastIbit(15, 2));
    }
    // Clear last I Bit
    public static int clearLastIbit(int n,int i){
        // -1 = 111111  taking -1 bcz left shift will give required 0 and we can perform & operator on bitmask
        int bitmask = ((-1) << i); // 111100 (i = 2)
        return n & bitmask;
    }

    // Clear Range of Bits
    public static int clearRangeofBit(int n,int i,int j){
        d
    }
}
