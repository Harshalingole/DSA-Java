package Kunal_Kushwah.LinearSearch;

public class EvenDigit {
    public static void main(String[] args) {
        int[] nums = {1,23,4,34,2432,5,234};
        System.out.println(evenDigitCount(nums));
    }
    public static int evenDigitCount(int[] arr) {
        int output = 0;
        for (int num : arr) {
            int count = digitCount(num);
            if (checkEven(count)) {
                output++;
            }
        }
        return output;
    }
    // To check if number is even or not
    public static boolean checkEven(int count) {
        return count % 2 == 0;
    }
    // No of digit in Number
    public static int digitCount(int num) {
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            // System.out.println(num);
            count++;
            num = num /10;
        }
        return count;
    }
}
