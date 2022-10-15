package Kunal_Kushwah.LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {23,1,4},
            {18,12,3,6},
            {78,99,34,15}
        };
        int target = 3;
        int[] ans = searchIn2D(arr, target); // format of return value {row,col}
        System.out.println(Arrays.toString(ans));

    }
    public static int[] searchIn2D(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] {row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
