package Kunal_Kushwah.Strings;

import java.util.Arrays;

public class StrMethod {
    public static void main(String[] args) {
        String name = "Harshal Ingole";
        // 1) COnverting into character array
        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(name.toUpperCase()); //original obj is not going to change
        System.out.println(name);
        // 2)White spaces at both end will be remove 
        System.out.println("  Harshal  ".strip());
        // 3)split from given regex (cut from space)
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
