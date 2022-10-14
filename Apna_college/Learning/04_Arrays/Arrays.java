package Content;

import java.lang.reflect.Array;

import javax.print.PrintService;

public class Arrays {
    // Reverse an Array
    public static void Reverse_Array(int Array[]) {
        int first = 0; int last = Array.length - 1;
        while (first < last) {
            int temp=  Array[first];
            Array[first] = Array[last];
            Array[last] = temp;
            first++;
            last--;
        }
    }
    // Pairs in Array
    public static void Pairs_inArray(int Array[]) {
        // Outer Loop
        for (int i = 0; i <= Array.length - 1; i++) {
            // Inner Loop
            for (int j = i + 1; j <= Array.length -1; j++) {
                System.out.print("(" +Array[i]+","+Array[j]+")"+" ");
            }
            System.out.println();
        }
    }
    // Printing Continues SubArrays From Array {O(n^3)} 
    public static void Print_SubArrays(int Array[]) {
         // Outer Loop(1)
         int maxSum = Integer.MIN_VALUE;
         int minSum =Integer.MAX_VALUE;
         for (int i = 0; i < Array.length ; i++) {
            int start = i;
            // Inner Loop
            for (int j = i; j < Array.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <=end; k++) {
                    System.out.print(Array[k] +" ");
                    sum+=Array[k];
                    // MaxSum Condition
                    if (maxSum < sum) {
                        maxSum = sum;
                    }
                    // MinSum Condition
                    if (minSum > sum) {
                        minSum = sum;
                    }
                }
                System.out.print(" Sum ="+sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("MaxSum="+ maxSum +"  &  "+ "MinSum="+ minSum);
    }
    // MaxSubArraySum (1) -Brute Force Approach {O(n^3)}
    public static void maxSubArraySum_Brute(int Array[]) {
        // Outer Loop(1)
        int maxSum = Integer.MIN_VALUE;
        int minSum =Integer.MAX_VALUE;
        for (int i = 0; i < Array.length ; i++) {
           int start = i;
           // Inner Loop
           for (int j = i; j < Array.length; j++) {
               int end = j;
               int sum = 0;
               for (int k = start; k <=end; k++) {
                   sum+=Array[k];
                   // MaxSum Condition
                   if (maxSum < sum) {
                       maxSum = sum;
                   }
                   // MinSum Condition
                   if (minSum > sum) {
                       minSum = sum;
                   }
               }
            //    System.out.print(" Sum ="+sum);
            //    System.out.println();
           }
        //    System.out.println();
       }
       System.out.println("MaxSum="+ maxSum +"  &  "+ "MinSum="+ minSum);
    }

    // MaxSubArraySum (1) -Prefix Sum Approach {O(n^2)}
    public static void MaxSubArraySum_Prefix(int Array[]) {
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] =new int[Array.length];
        prefix[0] = Array[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i -1] + Array[i];
        }
        // for (int i = 0; i < prefix.length; i++) {
        //     System.out.print(prefix[i]+ " ");
        // }
        for (int i = 0; i < Array.length; i++) {
            int start = i;
            for (int j = i; j < Array.length; j++) {
                int end = j;
                curSum = start == 0 ? prefix[end] : prefix[end] - prefix[start -1];
                if (maxSum < curSum) {
                    maxSum = curSum;
                }
            }
        }
        System.out.println("MaxSum="+ maxSum);
    }
    // MaxSubArraySum (1) -Kadanes Algorithm  Approach {O(n)}
    public static void maxSubArraySum_Kadanes(int Array[]) {
        // If All the Array Value are Negative
        boolean Negative = true;
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        // To Check if Positive Value Exist in Array 
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] > 0) {
                Negative = false;
                break;
            }
        }
        // If All Array Value Are -ve then 
        if (Negative) {
            for (int i = 0; i < Array.length; i++) {
                if (Array[i] > maxSum ) {
                    maxSum = Array[i];
                }
            }
        }else{
            for (int i = 0; i < Array.length; i++) {
                curSum+= Array[i];
                if (curSum < 0) {
                    curSum = 0;
                }
            }
            maxSum = Math.max(curSum, maxSum);
        }
        System.out.print("MaxSum="+ maxSum);
    }
    // Trapping Rainwater - Total Area of water trap
    public static void Trapping_Rainwater(int Array[]) {
        // Minimum length of Array 
        int TrapArea = 0;
        if (Array.length < 3) {
             System.out.print("Area="+ TrapArea);
        }
        // Auxilary Array - MaxLeft & MaxRight Boundary height 
        int maxLeft[] = new int[Array.length];
        maxLeft[0] = Array[0];
        int MaxRight[] = new int[Array.length];
        MaxRight[Array.length - 1] = Array[Array.length - 1];
        // System.out.println(MaxRight[6] +" "+ Array[6-1]);
        // Loop For Filling MaxLeft Boundary Array
        for (int i = 1; i < Array.length; i++) {
            if (maxLeft[i -1] > Array[i]) {
                maxLeft[i] = maxLeft[i -1];
            }else {
                maxLeft[i] = Array[i];
            }
        }
        // Loop For Filling MaxRight Boundary Array
        for (int i = Array.length - 1; i >= 1; i--) {
            // System.out.print(i);
            if (MaxRight[i] > Array[i -1]) {
                MaxRight[i -1] = MaxRight[i];
            }else {
                MaxRight[i - 1] = Array[i -1];
            }
        }
        // Calculating TrapWater Area
        for (int j = 0; j < Array.length; j++) {
            int min_Value = Math.min(maxLeft[j], MaxRight[j]);
            TrapArea += min_Value - Array[j];
        }
        System.out.println("Total Trap Water Area= " + TrapArea);
    }
    // Best Time To Sell and Buy Stock
    public static int maximumProfit(int Array[]) {
        int n = Array.length;
        // outer loop
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            // inner Loop
            for (int j = 1; j < n -1; j++) {
                // profit = Selling Price - Buying Price
                int curProfit = Array[i + j] - Array[i];
                maxProfit = Math.max(maxProfit, curProfit);
            }
        }
        // System.out.println("MaxProfit= "+ maxPrfoi);
        return maxProfit;
    }
    public static void main(String args[]) {
        // int Array1[] = {1,2,3,4,5};
        // int Array1[] = {2,4,6,8,10};
        // int Array1[] = {1,-2,6,-1,3};
        // int Array1[] = {-2,-3,4,-1,-2,1,5,-3};
        int Array1[] = {-2,-3,-4,-1,-2,-1,-5,-3};
        int height[] = {4,2,0,6,3,2,5};
        int prices[] ={7,1,5,3,6,4};
        // Reverse_Array(Array1);
        // Pairs_inArray(Array1);
        // Print_SubArrays(Array1);

        // MaxSubArraySum (1) -Brute Force Approach -
        // maxSubArraySum_Brute(Array1);

        // MaxSubArraySum (1) -Prefix Sum Approach {O(n^2)}
        // MaxSubArraySum_Prefix(Array1);

        // MaxSubArraySum (1) -Kadanes Algorithm  Approach {O(n)}
        // maxSubArraySum_Kadanes(Array1);

        // Trapping_Rainwater(height);

        maximumProfit(prices);
    }
}
