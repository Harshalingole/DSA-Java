package Questions.Basic;

import java.util.Scanner;

public class conditional {
    public int removeDuplicates(int[] nums) {
        int[] newNum = new int[nums.length];
        int indNewNum = 0; 
        int k = 0;
        for (int i = 0; i < newNum.length -1; i++) {
            if (nums[i] != nums[i+1]) {
                newNum[indNewNum] = num[i];
                indNewNum++;
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q1) Program to identify positive or negative ///////////////
        // int num = sc.nextInt();
        // String type = num >= 0 ? "Positive" : "Negative";
        // System.out.println(type); 

        // Q2) Fewer Check
        // double temp = 103.5;
        // String fever = temp > 100 ? "You have Fever" : "You are Fit";
        // System.out.println(fever);

        // Q3) Day of Week
        // int dayNum = sc.nextInt();
        // switch (dayNum) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3: 
        //         System.out.println("Wednesday");
        //         break;
        //     case 4: 
        //         System.out.println("Thursday");
        //         break;       
        //     case 5: 
        //         System.out.println("Friday");
        //         break; 
        //     case 6: 
        //         System.out.println("Saturday");
        //         break;   
        //     case 7: 
        //         System.out.println("Wednesday");
        //         break;
        //     default:
        //         System.out.println("Enter DayNum between 1 to 7");
        //         break;
        // }

    }

}
