package Questions.Basic;

import java.util.Scanner;

// Question2:Writeaprogramthatreadsasetofintegers,andthenprintsthesumoftheeven and odd integers.
// Question 3 :Write a program to find the factorialof any number entered by the user.
// Question4:WriteaprogramtoprintthemultiplicationtableofanumberN,enteredbytheuser.
public class FlowLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Que 2
        /* 
        int n;
        int choice;
        int evenSum = 0;
        int oddSum = 0;
        do{
            n = sc.nextInt();
            if (n%2 == 0) {
                evenSum+=n;
            }else {
                oddSum+=n;
            }
            System.out.println("For Continue Press 1 & To exit press 2");
            choice = sc.nextInt();

        }while(choice == 1);
        System.out.println("Even Sum is:" + evenSum);
        System.out.println("odd Sum is: " + oddSum);
        */
        // Que 3
        /* int n = sc.nextInt();
        int factorial = 1;
        for (int i = n; i > 0; i--) {
           factorial *= i * 1; 
        }
        System.out.print(factorial);
        */
        // Que 4
        int n = sc.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(n * i);
        }
    }   
}
