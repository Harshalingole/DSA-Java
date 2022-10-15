package Kunal_Kushwah.LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println("Linear Search");
        int[] nums = {23,45,1,2,8,19,-3,16};
        int target = 2;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }                   

    public static int linearSearch(int[] arr ,int target) {
        // If Array Length is Zero
        System.out.println("start");
        if (arr.length == 0) {
            return -1;
        }
        // run a loop 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        // if target not found
        return -1;

    }
}
