package Kunal_Kushwah.Strings;

public class FirstLtrUpperCase {
    public static void main(String[] args) {
        // StringBuilder value = new StringBuilder("hi,i am shradha");
        String value = "hi,i am shradha";
        for (int i = 0; i < value.length(); i++) {
            int spind = 0;
            if (value.charAt(i) == ' ') {
                spind = i;
                char ch =  value.charAt(spind + 1);
                value.toUpperCase(ch);

            }
        }
        // for a given string convert the first letter of each word to uppercase;
        // public static void firstLetterUppercase() {
            
        // }
    }
}
