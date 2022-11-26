package Kunal_Kushwah.Strings;

import java.util.ArrayList;

import javax.naming.ldap.ManageReferralControl;

public class StrOperators {
    public static void main(String[] args) {
        System.out.println("String Operators -----");
        System.out.println('a' + 'b'); // 195
        System.out.println("a" + "b"); //ab
        System.out.println((char)('a' + 3)); //d

        System.out.println("a" + 1);  // similar to "a" + "1"

        System.out.println("harshal" + new ArrayList<>());  // harshal[]
        /*
            this will not work as + operator work with atleast one primitive data type
            
         */
        // System.out.println(new Integer(56) + new ArrayList<>());  
        System.out.println(new Integer(56) +" "+ new ArrayList<>());  //56 []
        
    }
}
