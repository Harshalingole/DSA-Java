package Kunal_Kushwah.BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] nums = {1,3,5,7,9,10,20,23,29,35,45};
        int target = 10;
    }

    public static int orderAgnosticBS(int[] arr,int target) {
        int start = 0;
        int end = arr.length -1;
        // Check sort order of array(Ascending or Descending)
        boolean isAscending = arr[start] < arr[end];
        // Loop
        while (start <= end) {
            // find middle element 
            int mid = start + (end - start)/2;
            // Best Case - mid == target
            if (arr[mid] == target) {
                return mid;
            }
            // if Array is Ascending order
            if (isAscending) {
                if (target > arr[mid]) {
                    // Search right side
                    end = mid -1;
                }else {
                    // Search left sid
                    start = mid + 1;
                }
            }else {
                if (target > arr[mid]) {
                    // Search in left Side
                    end = mid + 1;
                }else{
                    // Search in right side
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
