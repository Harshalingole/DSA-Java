package Geek_for_Geeks.Arrays.Easy;

public class MissingInteger {
    public static int missingNumber(int array[], int n) {
        // Your Code Here
        int k = 0;
        for(int i=1; i<=n -1;i++){
            for(int j=0; j< n-1; j++){
                if(array[j] == i){
                    break;
                }
                if(j == n-2){
                    k = i;
                }
            }
        }
        return k;
    }
    public static void main(String[] args){
        // int[] num = {1,2,3,5};
        int[] num = {6,1,2,8,3,4,7,10,5};
        // System.out.print(MissingNumber(num,5));
        // System.out.println(MissingNumber(num,5));
        System.out.print(missingNumber(num,10));

    }
}
