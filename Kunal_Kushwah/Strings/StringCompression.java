package Kunal_Kushwah.Strings;

public class StringCompression {
    public static void main(String[] args) {
        String value = "aaabbcccdde";
        strCompress(value);
    }
    public static void strCompress(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = str.charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch  ) {
                count++;
            }else{
                sb.append(ch);
                sb.append(count);
                ch = str.charAt(i);
                count = 1;
            }
        }
        sb.append(ch);
        sb.append(count);
        System.out.print(sb);
    }
}
