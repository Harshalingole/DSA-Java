package Kunal_Kushwah.MathForDsa;

public class isPrime {
    public static void main(String[] args) {
        int n = 7;
        // System.out.println(IsPrime(n));
        // Q1)
        int range = 40;
        boolean[] prime = new boolean[range + 1]; // range + 1 bcz to include 40 also else range
        seive(range, prime);
    }
    // Optimize Solution with TimeComplexity = Math.sqrt(N)
    public static boolean IsPrime(int n){
        // condition to exclude negative no.
        if (n < 1) {
            return false;
        }
        int c = 2; // c = 2 bcz all No are divisible by 1
        // Here we are checking numbers till Math.sqrt(n) as after this no start repeating itself
        while (c * c <= n) { // c << Math.sqrt(n) => afterSquaring both side => c * c <= n
            if (n % c == 0) { // if remainder is zero then its non prime number
                return false; //hence it will return false
            }
            c++;
        }
        return true;
    }

    // Question Related to Prime Number

    // Q1) You are given a number N,You have to find out all the number less than N that are Prime number?
    // Time Complexity = O(N * log(log N))
    public static void seive(int range,boolean[] prime){
        /*
         For Ex: N = 40 ------Logic------------
         1)When you know 2 is prime => multiple of 2 will be not prime =>So eliminate multiple of 2
         2)Similarly for 3,5 [You have to check till Math.sqrt(N)-(bcz after this factor repeat) 
           and eliminate multiple respectively] 
            2-A)To maintain elimination we create Boolean Array(initially in boolean ary all val r false)
            (Where True indices will be Non Prime Number & False indices will be prime )
            2-B)Then we can print Index No. Which are False i.e List of Prime Numbers in given Range
         3) After eliminating multiple you will remain with prime number only
         */

        for (int i = 2; i * i <= range; i++) {
            // False in array means number is prime
            if (!prime[i]) { //if ith value in prime array is false
                for (int j = i*i; j <= range; j+=i) { // then change all the multiple to True
                    prime[j] = true;
                }
            }
        }
        // Just Printing Prime Number
        for (int i = 2; i <=range; i++) {
            if (!prime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
