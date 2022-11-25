package Kunal_Kushwah.SortingAlgo.CyclicSort;

import java.util.ArrayList;
import java.util.List;

public class SetMismatch {
    public static void main(String[] args){
        int[] arr = {1,2,2,4};
        // output = [2,3]
        System.out.println(setMismatch(arr));
    }
    // find the number that occurs twice and the number that is missing and return them in form 
    // of array 
    public static List<Integer> setMismatch(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] -1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }else {
                i++;
            }
        }
        List<Integer> missmatch = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                missmatch.add(arr[j]);
                missmatch.add(j +1);
            }
        }
        return missmatch;
    }
    // swap code
    public static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
