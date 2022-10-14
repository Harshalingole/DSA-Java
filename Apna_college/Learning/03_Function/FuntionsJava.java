package Content;

public class FuntionsJava {
    public static void printHello() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
    public static int multiply(int num1,int num2) {
        int product = num1 * num2;
        return product;
    }
    public static void main(String args[]) {
        printHello();
        int prod = multiply(2, 4);
        System.out.println(prod);
    }
}
