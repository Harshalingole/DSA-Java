package Kunal_Kushwah.Strings;

public class ShortestPath {
    public static void main(String[] args) {
        String dir = "WNEENESENNN";
        // System.out.println(shortestPath(dir));
        System.out.print(shortestPath(dir));
    }
    public static float shortestPath(String str) {
        int x = 0; 
        int y = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                default:
                    break;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
    }
}
