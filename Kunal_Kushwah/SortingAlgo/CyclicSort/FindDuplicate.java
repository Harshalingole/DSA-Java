package Kunal_Kushwah.SortingAlgo.CyclicSort;

public class FindDuplicate {
    public static void main(String[] args) {
        int arr[] = {5,1,3,4,2};
        System.out.println(findDuplicate(arr));        
    }
    // find duplicate number
    public static int findDuplicate(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] -1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return arr[j];
            }
        }
        return -1;
    }
    public static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
