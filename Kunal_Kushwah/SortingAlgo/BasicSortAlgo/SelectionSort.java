package Kunal_Kushwah.SortingAlgo.BasicSortAlgo;

public class SelectionSort {
    public static void main(String[] args) {
        // int[] arr = {3,6,2,1,8,7,4,5,3,1};
        int[] arr = {5,1,3,4,2};
        selectionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    // Selection sort
    public static void selectionSort(int[] arr){
        // from start to end find smallest element and push it at the beginning
        for (int i = 0; i < arr.length - 1; i++) {
            int minpos = i;
            // looping in unsorted array to find smallest element in order to updated minpos
            for (int j = i+ 1; j < arr.length -2; j++) {
                // finding smallest element 
                if (arr[minpos] > arr[j]) {
                    // updating smallest element value
                    minpos = j;
                }
            }
            // swapping current element with smallest element from unsorted array
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }
}
