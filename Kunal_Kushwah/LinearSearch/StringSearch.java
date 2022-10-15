package Kunal_Kushwah.LinearSearch;

public class StringSearch {
    public static void main(String[] args) {
        String name = "Harshal";
        char target =  'y';
        System.out.println(searchString(name, target));
    }

    // Search In String
    public static boolean searchString(String name, char target) {
        if (name.length() == 0) {
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)) {
                return true;
            }
        }

        return false;
    }
}
