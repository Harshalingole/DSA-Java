package Kunal_Kushwah.SortingAlgo.CyclicSort;

public class FirstMissingPositve {
    public static void main(String[] args) {
    //   int[] num ={1,2,0};  
    //   int[] num ={3,4,-1,1};  
      int[] num ={7,8,9,11,12}; 
    System.out.print(firstMissingPositive(num));
    }
    // given an unsorted integer array of nums,return the smallest positive integer.
    public static int firstMissingPositive(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            /*  as array is not in range of 1 to n numbers it may contain -ve or number greater than of arr.length
                that's why two more condition wil be application in order to swap value
                1)ignore -ve value => arr[i] >= 0
                2)ignore value grater than array length => arr[i] < arr.length
            */
            if (arr[i] >= 0 && arr[i] < arr.length && arr[i] != arr[correct] ) {
                swap(arr, i, correct);
            }else {
                i++;
            }
        }
        /* starting from 1 bcz we are looking for first positive missing number after sorting array
            arr[0] value wil be not +ve therefore skipping i = 0
        */ 
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
        // if all the array element are sorted in order 1 to N
        return arr.length + 1;
    }    

    // swap code
    public static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
}
