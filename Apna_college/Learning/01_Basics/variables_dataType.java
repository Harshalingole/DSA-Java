package Questions.Basic;

import java.util.Scanner;

public class variables_dataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q1) Avg OF three   //////////////////////
        // int A = sc.nextInt();
        // int B = sc.nextInt();
        // int C = sc.nextInt();
        // int Avg =( A + B + C )/3;
        // System.out.println(Avg);

        // Q2) Area of square
        // int s = sc.nextInt();
        // int area = s * s;
        // System.out.println(area);

        // Q3) Total Cost item  ///////////////////
        // int $ = 24;
        // float pencil = sc.nextFloat();
        // float pen = sc.nextFloat();
        // float eraser = sc.nextFloat();
        // float total = pencil + pen + eraser;
        // float bill = (total * 0.18f) +total;
        // System.out.println(total);
        // System.out.println(bill);

        // Income Tax Calculator
        // float income = sc.nextInt();
        // float tax = 0;
        // if (income <5 ) {
        //     tax = 0;
        // } else if(income >= 5 && income <10) {
        //     tax = income * 0.20f;
        // }else {
        //     tax = income * 0.30f;
        // }

        // System.out.println(tax);

        // Print the largest three Number
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A > B && A > C) {
            System.out.println(A);
        } else if(B > C) {
            System.out.println(B);
        } else {
            System.out.println(C);
        }

    }
    
}
