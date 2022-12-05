package Kunal_Kushwah.MathForDsa.BitManipulaton;

import javax.swing.plaf.metal.MetalTheme;

public class MagicNumber {
    public static void main(String [] args){
        int n =6;
        nthMagicNum(n);
    }
    // Amazon Question
    // find nth magic number formula => 110 => 1*(5)^3 + 1*(5)^2 + 0*(5)^1 = 30()
    public static void nthMagicNum(int n){
        int ans = 0;
        int base = 5; 
        while (n > 0) {
           int last = n & 1; //getting Right most digit from binary form of no
           n = n >> 1; //shifting second right most digit to Right most digit
           ans += last * base; 
           base = base * 5;
        }
        System.out.print(ans);
    }
}
