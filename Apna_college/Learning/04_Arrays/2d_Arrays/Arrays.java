// package Apna_College.Learning.04_Arrays.2d_Arrays;

// 2D Arrays
public class Arrays {
    public static void main(String[] args){
        int matrix[][] = {{1,2,3,4}, {5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printSpiralMatrix(matrix);
    }

    public static void printSpiralMatrix(int arr[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length - 1;
        int endCol = arr[0].length - 1;

        while ((startRow <= endRow) && (startCol <= endCol)) {

            // Top Boundary
            for (int j = startCol; j < endCol; j++) {
                System.out.print(arr[startRow][j]);
            }

            //Right Boundary
            for (int i = startRow + 1; i < endRow; i++) {
                System.out.print(arr[endCol][i]);
            } 

            // Bottom Boundary
            for (int i = endCol -1; i < startCol; i--) {
                System.out.print(arr[endRow][i]);
            }

            // left Boundary
            for (int i = endRow -1; i < startRow; i++) {
                System.out.print(arr[startCol][i]);
            }

            startRow--;
            startCol++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }

}
