package Kunal_Kushwah.MathForDsa.BitManipulaton;

public class RightSetBitPos {
    public static void main(String[] args) {
        int n = 182;
        System.out.println(rightMostSetBitPos(n));
    }
    // Find position of right most set bit
    // solution is incorrect
    public static int rightMostSetBitPos(int n){
        int i = 0;
        while ((n & (1 << i))  != n) {
            i++;
        }
        return i;
    }
}
