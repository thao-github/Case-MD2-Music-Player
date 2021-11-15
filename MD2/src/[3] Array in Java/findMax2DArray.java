import java.util.Scanner;

public class findMax2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the row: ");
        int row = scanner.nextInt();
        System.out.println("Enter the column: ");
        int column = scanner.nextInt();

        System.out.println("Enter the matrix data: ");
        int[][] matrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The matrix is: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        int max = matrix[0][0];
        int index = 0;
        int index1 = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                    index = i;
                    index1 = j;
                }

            }
        }
        System.out.println("The max is: " +max + " at the index: " + "[" + index + "]" +  "[" + index1 + "]");
    }
}
