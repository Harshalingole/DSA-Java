package Apna_College.Learning.BitManipulation;

public class BitOddorEven {
    public static void main(String[] args){
        System.out.println("Bit Manipulation");
        oddOrEven(3);
        oddOrEven(11);
        oddOrEven(14);
    }

    public static void oddOrEven(int num){
        int bitmask =1;
        if((num & bitmask) == 1){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
    }
}
