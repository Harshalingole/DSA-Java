package Apna_College.Learning.BitManipulation;

public class BitOperations {
    public static void main(String[] args) {
        System.out.println("Bit Operations");
        System.out.println(getIthBit(4, 2));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearItBit(10, 1));
    }

    // Get ith bit
    public static int getIthBit(int num,int i){
        int bitmask = 1 << i;
        if ((num & bitmask) == 0) {
            return 0;
        }else {
            return 1;
        }
    }

    // Set ith Bit
    public static int setIthBit(int num,int i){
        int bitmask = 1 << i;
        return num | bitmask;
    }

    // Clear ith Bit
    public static int clearItBit(int num,int i){
        int bitmask = ~(1 << i);
        return num & bitmask;
    }

    // Update ith Bit
    public static int updateIthBIt(int num,int i,int newBit){
        // Simple straightforward solution
        // if (newBit == 0) {
            // return clearItBit(num, i);
        // }else{
            // return setIthBit(num, newBit);
        // }
        // Second Solution 
        num = clearItBit(num, i);
        int bitmask = newBit << i;
        return num | bitmask;
    }
}
