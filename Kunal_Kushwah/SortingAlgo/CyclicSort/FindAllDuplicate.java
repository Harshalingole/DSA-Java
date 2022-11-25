package Kunal_Kushwah.SortingAlgo.CyclicSort;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class FindAllDuplicate {
    public static void main(String[] args) {
        System.out.println("Hello Harshal");
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findAllDuplicates(arr));
    }

    public static List<Integer> findAllDuplicates(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
        // looping over sorted array to find out duplicate element
        // just find missing number
        List<Integer> missing = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                missing.add(arr[j]);
            }
        }
        return missing;
    }
    public static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
