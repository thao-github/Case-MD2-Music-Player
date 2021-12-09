import java.util.Scanner;
public class sumOfDiagonalElements2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the rows: ");
            int row = scanner.nextInt();
            System.out.println("Enter the columns: ");
            int column = scanner.nextInt();
            if (row != column) {
                System.out.println("Enter the number of rows the same as columns");
            }

        System.out.println("Enter the Matrix data: ");
            int [][] matrix = new int[row][column];
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < column; j++) {
                        matrix[i][j] = scanner.nextInt();
                    }
            }
        System.out.println("Your matrix is: ");
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < column; j++) {
                        System.out.print(matrix[i][j] + "\t");
                    }
                    System.out.println();
                }

                int sum = 0;
                for (int i = 0; i < matrix.length; i++) {
                    sum += matrix[i][i];
                }
        System.out.println(sum);
        }
    }
