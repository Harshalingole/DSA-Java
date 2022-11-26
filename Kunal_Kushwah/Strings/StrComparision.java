package Kunal_Kushwah.Strings;

public class StrComparision {
    public static void main(String[] args){
        System.out.print("String Comparison");
        /*  a and b is store in pool inside heap and 
            both a and b is pointing to the same object inside string pool
        */
        String a = "Harshal";
        String b = "Harshal";
        String c = a;
        // == operator => check if both variable are pointing to the same object
        System.out.println(a == b); //true
        System.out.println(c == b); //true
        // .equal() method => check only variable values are equal or not
        System.out.println(a.equals(b)); //true

        // ////////////////////////////////////////////////////////
        // Creating two different String of same value
        String x = new String("Ingole");
        String y = new String("Ingole");
        System.out.println(x == y); //false  bcz => x and y are separate obj store in heap not in pool
        System.out.println(x.equals(y)); // true
    }
    
}
