package Kunal_Kushwah.SortingAlgo.CyclicSort;

public class CyclicSort {
    public static void main(String[] args) {
        // System.out.print("Hello world");
        int arr[] = {3,5,2,1,4};
        cyclicSort(arr);
        printArray(arr);
    }
    // Cyclic sort code
    public static void cyclicSort(int arr[]){
        int i = 0;
        int correct = arr[i] - 1;
        if (arr[i] != arr[correct]) {
            swap(arr,i,correct);
        }else {
            i++;
        }
    }
    public static void swap(int arr[],int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    // Print array 
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
