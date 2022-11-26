package Kunal_Kushwah.Strings;

import javax.print.event.PrintEvent;

public class PrettyPrinting {
    public static void main(String[] args) {
        System.out.println("Pretty Printing");

        float a = 453.13423f;
        System.out.printf("Formatted number is %.2f",a);
        System.out.printf("%.2f",a);  //453.13
        System.out.println();

        String name = "Harshal";
        String role = "developer";
        System.out.printf("My name is %s and i am %s", "Harshal","developer");
        System.out.println();
        System.out.printf("My name is %s and i am %s", name,role);
        System.out.println();

        // Search for format specifier for string in java or placeholder for string
        /*
         Conversion Characters and their Meanings
Conversion	Meaning
b	For formatting an argument that is Boolean
c	For formatting an argument that is a Unicode character
s	For formatting an argument that is a string
d	For formatting an argument that is a decimal integer
f	For formatting an argument that is a number with a decimal point
%	For printing only % for the argument, ‘%’
n	To cause the rest of the text on its right, to go on the next line at the output
         */
    }
}
