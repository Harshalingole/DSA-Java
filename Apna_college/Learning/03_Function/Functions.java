package Questions.Basic;

import java.util.Scanner;

public class Functions {

    public static int average(int a,int b,int c) {
        return ( a + b + c) /3;
    }
    public static boolean isEven(int n){
        if (n % 2 == 0) {
            return true;
        }else {
            return false;
        }
    }
    public static boolean isPalindrome(int a) {
        int revValue =0;
        int que = a;
        do {
            int rem = que % 10;
            revValue = (revValue * 10) + rem;
            que = que / 10;
        } while (que !=0);

        if (revValue == a) {
            return true;
        }else {
            return false;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // System.out.println(average(a, b, c)) ;
        // System.out.println(isEven(a));
        System.out.println(isPalindrome(a));

    }
}
