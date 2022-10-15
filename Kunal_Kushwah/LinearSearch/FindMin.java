package Kunal_Kushwah.LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] nums = {23,45,1,2,8,19,-3,16};
        System.out.println(findMin(nums, 1, 4));
    }
    // Find Min in the range of [1,4]
    public static int findMin(int[] nums, int st, int ed) {
        int min = nums[st];
        for (int i = st; i <ed; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        return min;
    }
}
