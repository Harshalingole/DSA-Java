package Kunal_Kushwah.BinarySearch;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(ceiling(arr, target));
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
        return start;
    }
}
