import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = readMatrix(scanner, ", ");


        int sum = Arrays.stream(matrix)
                .flatMapToInt(IntStream::of)
                .sum();

//        for (int[] arr : matrix) {
//            for (int number : arr) {
//                sum += number;
//            }
//        }
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        System.out.println(sum);


    }
    private static int[][] readMatrix(Scanner scanner, String pattern) {
        int[] rowsAndCols = readArray(scanner, pattern);

        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];

        int[][] matrix = new int[rows][cols];

        for (int r = 0; r < matrix.length; r++) {
            matrix[r] = readArray(scanner, pattern);

        }

        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static int[] readArray(Scanner scanner, String pattern) {
        return Arrays.stream(scanner.nextLine()
                .split(pattern))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}