package Kunal_Kushwah.SortingAlgo.CyclicSort;

public class FindMissing {
    public static void main(String[] args) {
        int arr[] = {0,5,2,1,4};
        System.out.print(missingNum(arr));        
    }

    // Find missing number - amazon que
    public static int missingNum(int[] arr){
        int i = 0;
        while(i < arr.length){
            
            int correct = arr[i];
            if (arr[i] < arr.length &&  arr[i] != arr[correct]  ) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
        return arr.length;
    }
    public static void swap(int arr[],int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
