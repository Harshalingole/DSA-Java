package Kunal_Kushwah.Strings;

public class StrBuilder {
    public static void main(String[] args){
        System.out.println("String Builder --Performance");
        // Time complexity is O(N^2) => its creating new object every time loop running
        // because of which so much space is wasted (Not optimize to modify string)
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            System.out.print(ch); //  ch is not storing reference(bcz of Immutability)
        }
        System.out.println("-----------");
        // STRING BUILDER -- Mutable just like array
        StringBuilder builder = new StringBuilder();
        // It has many method to work with
        for (int i = 0; i < 26; i++) {  // Time complexity O(N) => Not creating new object every time loop running
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.print(builder);
    }
}
