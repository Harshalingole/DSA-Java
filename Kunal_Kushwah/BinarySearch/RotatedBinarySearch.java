package Kunal_Kushwah.BinarySearch;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        
        int target = 7;
        // System.out.print(peakOfArray(nums));
        System.out.println(searchRotatedArray(nums, target));
    }
    // Search in Rotated Sorted Array
    public static int searchRotatedArray(int[] nums, int target) {
        int pivot = peakOfArray(nums);
        if (nums[pivot] == target) {
            return pivot;
        }
        // OrderAbs in right side
        int oabsRight = orderAgnosticBS(nums, target, pivot, nums.length -1);
        if (oabsRight != -1) {
            return oabsRight;
        }else {
            return orderAgnosticBS(nums, target, 0, pivot);
        }
    }
    // find the peak of element
    public static int peakOfArray(int[] nums) {
        int start = 0;
        int end = nums.length -1;

        while (start < end) {
            // find mid index
            int mid = start + (end -start)/2;
            // When start == end => both will point to largest element in array
            if (start == end) {
                break;
            }
            if (nums[mid] > nums[mid + 1]) {
                // search in left side
                end=mid;
            }else if (nums[mid] < nums[mid +1]) {
                // search in right side
                start = mid + 1;
            }
        }
        return start;
    }

    public static int  orderAgnosticBS(int[] nums,int target,int start,int end) {
        
        while (start <= end) {
            int mid = start + (end - start)/2;

            if (target > nums[mid]) {
                start = mid+1;
            }else if (target < nums[mid]) {
                end = mid -1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
