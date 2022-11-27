package Kunal_Kushwah.Strings;

public class IsPalindrome {
    public static void main(String[] args) {
        String value = "abcdcba";
        System.out.println(isPalindrome(value));
        
    }
    public static boolean isPalindrome(String value){
        if (value == null || value.length() == 0) {
            return true;
        }
        String str = value.toLowerCase();
        for (int i = 0; i <= str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if (start != end) {
                return false;
            }
        }
        return true;
    }
}
