package Kunal_Kushwah.MathForDsa.BitManipulaton;

public class DigitsInBaseb {
    public static void main(String[] args) {
        int n = 1015;
        numofdigits(n);
        NoOfDigits(n);
    }
    // find the no of digits in base b
    public static void numofdigits(int n){
        int count = 0;
        while (n >1) {
            n = n / 2;
            count++;
        }
        System.out.println(count + 1);
    }
    // more optimize solution using formula
    /*
     No.of digits in base b of no. N = int(log b N) + 1; where b = base;
     log b a = log x a /log x b
     */
    // Time complexity = log n
    public static void NoOfDigits(int n){
        int b = 2; // here b = base of number system you want to use ex: b=10(decimal) b=2(binary)
        int ans = (int)(Math.log(n) / Math.log(b)) + 1;
        System.out.println(ans);
    }
}
