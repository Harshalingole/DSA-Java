package Questions.Arrays;

public class Arrays {
    // ARRAYS ASSIGNMENT

    // Q1) -Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct
    public static boolean duplicate(int Array[]) {
        for (int i = 0; i < Array.length; i++) {
            for (int j = i; j < Array.length -1; j++) {
                if (Array[i] == Array[j +1]) {
                    return true;
                    // System.out.print("True");
                }
            }
        }
        return false;
    }

    // Q2)Given the array nums after the possible rotation and an integer target, returnthe index oftarget if it is in nums, or -1   if it is not in nums
    public static int target_Index(int Array[],int target) {
        for (int i = 0; i < Array.length; i++) {
            if (target == Array[i]) {
                return i;
            }
        }
        return -1;
    }
    // Q2)
    public static void Unique_Triplets_SubArray(int Array[]) {
        // int n[] =Array;
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array.length -2; j++) {
                int sum = 0;
                int triplet[] = new int[3];
                triplet[0] = Array[i];
                triplet[1] = Array[j+1];
                triplet[2] = Array[j + 2];
                sum = Array[i] + Array[j+1] + Array[j + 2];
                // System.out.print(sum + " ");
                boolean unique = (Array[i] != Array[j+1]) && (Array[i] != Array[j+2]) && (Array[j+1] != Array[j+2]);
                // System.out.print((sum == 0) && (unique));
                if ((sum == 0) && (unique)) {
                    for (int k = 0; k < triplet.length; k++) {
                        System.out.print(triplet[k] + " ");
                    }  
                    System.out.println();
                }
            }
        }
        // return -1;
    }
    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        // Your code here
        for(i=0; i< arr.length; i++){
        int sum = 0;
            for(j=i;j<arr.length;j++){
                sum+= arr[j];
                if(sum == s);
                numbers.add(i);
                numbers.add(j);
                return(numbers);
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        // int numbers[] = {1,2,3,4,3};
        // int numbers[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        // int numbers[] = {4,  5, 6, 7, 0, 1, 2};
        // int numbers[] = {1};
        // int numbers[] = {-1, 0,  1, 2, -1, -4};
        int numbers[] = {1,2,3,7,5};
        // System.out.print(duplicate(numbers));
        // System.out.print(target_Index(numbers,0));
        // System.out.print(Unique_Triplets_SubArray(numbers));
        // System.out.print(Unique_Triplets_SubArray(numbers));
        // Unique_Triplets_SubArray(numbers);
        subarraySum(numbers, 5, 12);
    }
}
