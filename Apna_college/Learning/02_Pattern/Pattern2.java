package Content;

import java.util.concurrent.ForkJoinPool;

import javax.sound.sampled.Line;

public class Pattern2 {
    // Inverted Half Pyramid
    public static void inverted_pyramid(int totalRows) {
        // Outer Loop - Total Lines
        for (int i = 1; i <= totalRows; i++) {
            // Inner Loop
            for (int j = 1; j <= totalRows - i; j++) {
                System.out.print(" ");
            };
            for (int j = totalRows - i; j < totalRows ; j++) {
                System.out.print("*");   
            }
            System.out.println();
        }
    }
    // Inverted Half Pyramid -With Number
    public static void inverted_pyramid_number(int n) {
        // outer Loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= (n+1) -i; j++) {
                System.out.print(j);
            };
            for (int j2 = (n+1) -i; j2 <= n; j2++) {
                System.out.print("_");
            };
            System.out.println();
        }
    }
    // Floyd Triangle
    public static void floyd_Triangle(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count+ " ");
                count++;
            }
            System.out.println();
        }
    }
    // 0-1 Triangle
    public static void Triangle01(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            if (!(i % 2 == 0)) {
                count = 0;
            }
            for (int j = 1; j <=i; j++) {
                if (count == 0) {
                    count++;
                } else {
                    count--;
                }
                System.out.print(count+" ");
            };
            System.out.println();
        }
    }
    // Butterfly Pattern
    public static void ButterflyPattern(int n) {
        // 1st half
       for (int i = 1; i <=n; i++) {
        // Stars
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        // Spaces
        for (int j = 1; j <=2*(n-i) ; j++) {
            System.out.print(" ");
        }
        // Stars
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
       }
       // 1st half
       for (int i = n; i >= 1; i--) {
        // Stars
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        // Spaces
        for (int j = 1; j <=2*(n-i) ; j++) {
            System.out.print(" ");
        }
        // Stars
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
       }
    }
    // solidRhombus
    public static void solidRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // Space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Star
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // HallowRhombus
    public static void HallowRhombus(int n) {
        for (int i = 1; i <= n ; i++) {
            // Spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // Star
            if (i ==1 || i == n) {
                for (int j = 1; j <=n; j++) {
                 System.out.print("*");    
                }
            }else {
                System.out.print("*");
            }
            if (!(i ==1 || i == n)) {
                System.out.print("   ");
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
    public static void diamond(int n) {
        int starCount = 1;
        // First Half
        for (int i = 1; i <=n; i++) {
            // Spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // Star
            for (int j = 1; j <= starCount ; j++) {
                System.out.print("*");
            }
            starCount += 2;
            System.out.println();
        }
        // Second Half- Inverted
        starCount -=2;
        for (int i = n; i >= 1; i--) {
            // Spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // Star
            for (int j = 1; j <= starCount ; j++) {
                System.out.print("*");
            }
            starCount -= 2;
            System.out.println();
        }
    }
    public static void Number_Pyramid(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void palindrome_withNumber(int n) {
        for (int i = 1; i <=n; i++) {
            int numCount = i;
            // spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(numCount);
                numCount--;
                if(numCount == 1) break;
            }
            // System.out.print(1);
            for (int j = i -1; j >= 0; j--) {
                System.out.print(numCount); 
                numCount++;
                if(numCount == 1) break;
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        // inverted_pyramid(7);

        // inverted_pyramid_number(7);

        // floyd_Triangle(5);

        // Triangle01(7);

        // ButterflyPattern(4);

        // solidRhombus(5);

        // HallowRhombus(6);

        // diamond(7);

        // Number_Pyramid(5);

        palindrome_withNumber(7);
    }
}
