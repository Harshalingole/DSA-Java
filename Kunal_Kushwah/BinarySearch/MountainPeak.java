package Kunal_Kushwah.BinarySearch;

public class MountainPeak {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5,6,4,3,2};
        System.out.print(peakOfMountain(nums));

    }
    public static int peakOfMountain(int[] nums) {
        int start = 0;
        int end = nums.length -1;

        while (start < end) {
            int mid = start + (end -start) /2;
            if (start == end) {
                break;
            }
            if (nums[mid +1] > nums[mid]) {
                // Search in right side
                // You are in increasing part of array

                start = mid + 1;
            }else if(nums[mid +1] < nums[mid]) {
                // Search in left side
                // You are in decreasing part of array
                // This may be ans,but look at left
                // this is why end != mid -1;
                end = mid;
            }
        }
        // in the end , start == end and pointing to the largest element number bcz of 2 Check above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element,that is max one of checks
        return end; // or end both are equal
    }
}
