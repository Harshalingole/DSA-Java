package Kunal_Kushwah.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        // int[] nums = {1,3,5,7,9,10,20,23,29,35,45};
        int [] arr = {2,4,6,7,12,15,16};
        int target = 6;
        System.out.println(binarySearch(arr, target));
    }
    // Binary Search - Knowing array is sorted without knowing in which order
    public static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length -1;
        // While loop
        while (start <= end) {
            // find middle element
            int mid = start + (end - start)/2;

            // Condition
            if (target > arr[mid]) {
                // Search in right side of array
                start = mid+1;
            }else if (target < arr[mid]) {
                // Search in left side of array
                end = mid-1;
            }else {
                // target array index found
                return mid;
            }
        }
        // Target not found
        return -1;
    }

    // Order Agnostic Binary Search - finding sorting order of array
    // based on sorting order of array doing process
    
}
