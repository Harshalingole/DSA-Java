package Kunal_Kushwah.MathForDsa.BitManipulaton;

public class IsPowerOf2 {
    public static void main(String[] args) {
        int n = 37;
        // System.out.println(ispowerof2(n));
        System.out.println(ispowerOf2(n));
    }
    // You are given a number N, find out if it is power of 2 or not
    // brute force approach --
    public static boolean ispowerof2(int n){ // solution is incorrect
        int base = 2;
        int digits = (int)(Math.log(n) /Math.log(base)) +1;
        int i = 0;
        while (digits > 0) {
            n = n >> i;
            if ((n & 1) != 1) {
                return false;
            }
            i++;
            digits--;
        }
        return true;
    }

    // Optimize approach
    public static boolean ispowerOf2(int n) {
        if(n == 0) return false;
        return (n & (n-1)) == 0;
    }
}
