package Kunal_Kushwah.LinearSearch;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
            {23,1,4,300},
            {18,12,3,6},
            {78,99,34,15}
        };
        System.out.println(maximumWealth(arr));
    }

    public static int maximumWealth(int[][] acc) {
        int maxWealth = Integer.MIN_VALUE;
        for (int row = 0; row < acc.length; row++) {
            int curWealth = 0;
            for (int col = 0; col < acc[row].length; col++) {
                curWealth += acc[row][col];
            }
            maxWealth = Math.max(maxWealth, curWealth);
        }
        return maxWealth;
    }
}
