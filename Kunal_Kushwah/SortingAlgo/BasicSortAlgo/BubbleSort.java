package Kunal_Kushwah.SortingAlgo.BasicSortAlgo;

public class BubbleSort {
    public static void main(String[] args){
        // int[] arr = {3,6,2,1,8,7,4,5,3,1};
        int[] arr = {5,1,3,4,2};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    // Bubble Sort Algorithm
    public static void bubbleSort(int arr[]){
        for(int turn = 0; turn <= arr.length -2; turn++){
            for (int j = 0; j <= arr.length - 2 - turn; j++) {
                // condition to swap largest with adjacent element
                if (arr[j] > arr[j+1]  ) {
                    // swap 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
