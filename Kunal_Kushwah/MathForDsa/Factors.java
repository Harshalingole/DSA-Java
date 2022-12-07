package Kunal_Kushwah.MathForDsa;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args){
        int n = 20;
        FactorsBrute(n);
        System.out.println();
        FactorsOptimize(n);
        System.out.println();
        Factors3(n);
    }
    // ///////////Factors Of A Number./////////////////////////
    /*
     Factors: number that divides another number is called factor of that number.
     Ex: 20 => 1,2,4,5,10,20 (this are all no that divide 20)
     */
    // Brute Force Approach - Time Complexity : O(N)
    public static void FactorsBrute(int n){
        // Running loop form 1 to given number and checking modulo is zero or not 
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {  //if modulo is zero then i is factor of n
                System.out.print(i + " ");
            }
        }
    }
    /*
     ---------Logic-------------
     ===> 1*2=20,2*10=20,4*5=20,5*4=20,10*2=20,20*1=20
     1)If we notice from above, factor are repeating after abs.sqrt(n) where n=4.
       i.e we do not need to run loop for n time instead abs.sqrt(n)
     */
    // Optimize Approach - Time Complexity : O(sqrt(N)) 
    public static void FactorsOptimize(int n) {
        int sqrt = (int)Math.abs(Math.sqrt(n)); //number after which factor start repeating
        for (int i = 1; i <= sqrt; i++) { 
            if (n % i == 0) {
                int qunt = n / i; // Quotient = dividend / divisor
                if (i != qunt) { // Condition to avoid printing duplicate factor(ex: 4*4=16!6*6=36)
                    System.out.print(i + " "+qunt+" ");
                }else {
                    System.out.print(i+ " ");
                }
            }
        }
    } //Note: you can remove extra variable sqrt and qunt and directly use it without storing.
    
    // 
    public static void Factors3(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) { 
            if (n % i == 0) {
                if (i !=  n / i) { 
                    System.out.print(i + " "); // 1,2,5
                }else {
                    System.out.print(i+ " ");
                    //adding quotient in array list in order to print in sorted order
                    list.add(n/i); //Ex: n=20 then [20,10,5]
                }
            }
        }
        for (int i = list.size() -1; i >=0; i--) { 
            // As we already printed 1,2,5 in asc sequence
            System.out.print(list.get(i)+ " "); // this will print [5,10,20]
        }
    }
}
