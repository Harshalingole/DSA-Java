package Other;

public class NewArray {
    public static void main(String[] args){
        int matrix[][] = {{1,2,3,4}, {5,6,7,8},{9,10,11,12},{13,14,15,16}};
        // int matrix[][] = {{1,2,3}, {4,5,6},{7,8,9}};
        // printSpiralMatrix(matrix);
        // digonalSum(matrix);
        searchInMatrix(matrix, 11);
    }
    public static boolean searchInMatrix(int arr[][],int key){
        // taking (n -1, 0)  staircase approach
        int i = arr.length - 1;
        int j = 0;

        while (i >= 0 && j <= arr[0].length - 1) {
            if (arr[i][j] == key) {
                System.out.print(i +" "+ j);
                return true;
            }
            if (key > arr[i][j]) {
                // Search in right
                j++;
            }
            if (key < arr[i][j]) {
                // Search in top
                i--;
            }
        }
        return false;
        // System.out.print("/")
    }

    public static void digonalSum(int arr[][]){
        int primary = 0;
        int secondary = 0;
        // System.out.println(arr.length);
        // int sum = 2;
        // int row = 1;
        // int col = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {                
                if (i == j) {
                    primary += arr[i][j];
                }
                if (i + j == arr.length - 1) {
                    secondary += arr[i][j];
                    if (i == j) {
                        secondary -= arr[i][j];
                    }
                }
            }
        }
        System.out.println("Primary:" + primary);
        System.out.println("Secondary:" + secondary);
        System.out.println("Total Sum:" + (secondary + primary));
    }

    public static void printSpiralMatrix(int arr[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length - 1;
        int endCol = arr[0].length - 1;

        while ((startRow <= endRow) && (startCol <= endCol)) {

            // Top Boundary
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(arr[startRow][j]+ " ");
            }

            //Right Boundary
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(arr[i][endCol]+ " ");
            } 

            // Bottom Boundary
            for (int j = endCol -1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(arr[endRow][j]+ " ");
            }

            // left Boundary
            for (int i = endRow -1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(arr[i][startCol]+ " ");
            }

            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }

}
