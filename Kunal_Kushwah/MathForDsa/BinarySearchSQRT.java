package Kunal_Kushwah.MathForDsa;

public class BinarySearchSQRT {
    public static void main(String[] args) {
        int n = 40;
        int p = 3; //precision value
        System.out.println(sqrt(n,p));
        System.out.printf("%3f",sqrt(n,p));
    }

    // Finding Square Root Of Number
    /*
     ------------Logic--------------
     Sqrt =>  n = root * root ,we need to find root
     --For Perfect Square root of Number--
     1)We know Sqrt of n i.e (root) going to less than n and we have to check from 0 to n.
       Which is a sorted sequence of number.
     2)We apply Binary Search Algo when there is sorted sequence/array in que.
     3)Applying Binary Search with mid Condition.
        3-a)if(mid * mid > n) : end = mid - 1 ? start = mid + 1;

    --Addon To get precision value with Decimal ! Ex: n=40; root=6.32
    4)We can get 6 of root by following binary search i.e above steps.
    5)now root = 6 => check while(root * root <= 40)=> if(root * root < n) : root+=0.1 ? root-=0.1
    6)For two digit precision you can follow 5 step with adding 0.01

     */
    // Time Complexity : O(log(n))
    public static double sqrt(int n,int p){
      int start = 0;
      int end = n;

      double root = 0.0;
      while (start <= end) {
        int mid = start + (end - start)/2;
        if (mid * mid == n) {
          root = mid;
          return root;
        }
        if (mid * mid > n) {
          end = mid -1;
        }else{
          start = mid + 1;
        }
      }
      double incr = 0.1; //Increment value  
      // Looping to get precision 
      for (int i = 0; i < p; i++) { //p times to get p decimal point
        while (root * root <= n) {
          root +=incr;
        }
        //once condition break we have to go back need to subtract
        root -= incr;
        // in every iteration we need to change incr value
        incr /= 10;
      }

      return root;
    }
}
