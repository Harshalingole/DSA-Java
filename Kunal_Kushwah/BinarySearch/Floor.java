package Kunal_Kushwah.BinarySearch;

import java.util.Arrays;

public class Floor {
    public static void main(String[] args) {
        // int[] arr = {2,3,5,9,14,16,18};
        // int[] arr = {9,6,4,2,3,5,7,0,1};
        int[] arr = {0,1,0,3,12};
        // int[] arr = {0,0,1};
        // int[] arr = {0};

        // int target = 15;
        // System.out.println(ceiling(arr, target));
        // System.out.println(missingNumber(arr));
        // System.out.println(moveZeros(arr));
        moveZeros(arr);
    }

    // Find Ceiling 
    public static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) /2;

            if (target > arr[mid]) {
                // right side
                start = mid +1;
            }else if (target < arr[mid]) {
                // left side
                end = end -1;
            }else {
                // target found
                return mid;
            }
        }
        return end;
    }
    // missing number
    public static int missingNumber(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i] == i)) {
                return i;
            }
        }
        return -1;
        
    }
    // Move Zeros
    public static void moveZeros(int[] arr) {
        int pos = 0;
        for(int i = 0;i < arr.length;i++) {
            if(arr[i] != 0) {
                if(i != pos) {
                    arr[pos] = arr[i];
                    arr[i] = 0;
                }
                pos++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+ " ");
        }
    }
}
