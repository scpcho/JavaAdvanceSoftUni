import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Task_02 {
    static int sapperRow;
    static int sapperCol;
    static int bombQuantity;
    static boolean isOut;
    static int[] currentPosition = new int[2];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        ArrayDeque<String> commands = new ArrayDeque<>();
        Arrays.stream(scan.nextLine().split(",")).forEach(commands::offer);

        char[][] matrix = readMatrix(scan, n);
        int bombs = findBombs(matrix);

        while (!isOut && !commands.isEmpty()) {
            currentPosition[0] = sapperRow;
            currentPosition[1] = sapperCol;
            String command = commands.poll();
            matrix[sapperRow][sapperCol] = '+';
            switch (command) {
                case "up":
                    sapperRow--;
                    isOut = move(sapperRow, sapperCol, matrix);
                    break;
                case "down":
                    sapperRow++;
                    isOut = move(sapperRow, sapperCol, matrix);
                    break;
                case "left":
                    sapperCol--;
                    isOut = move(sapperRow, sapperCol, matrix);
                    break;
                case "right":
                    sapperCol++;
                    isOut = move(sapperRow, sapperCol, matrix);
                    break;
            }
            if (bombQuantity == bombs) {
                System.out.println("Congratulations! You found all bombs!");
                break;
            }
        }

        if (isOut) {
            System.out.println("END! " + (bombs - bombQuantity) + " bombs left on the field");
        }

        if (commands.isEmpty() && bombQuantity != bombs && !isOut) {
            System.out.printf("%d bombs left on the field. Sapper position: (%d,%d)", (bombs - bombQuantity), sapperRow, sapperCol);
        }
    }

    private static int findBombs(char[][] matrix) {
        int bombsCount = 0;
        for (char[] chars : matrix) {
            for (char aChar : chars) {
                if (aChar == 'B') {
                    bombsCount++;
                }
            }
        }
        return bombsCount;
    }

    private static boolean move(int row, int col, char[][] matrix) {
        if (inBounds(row, col, matrix)) {
            char symbol = matrix[row][col];
            switch (symbol) {
                case 'e':
                    isOut = true;
                    break;
                case 'B':
                    matrix[row][col] = '+';
                    bombQuantity++;
                    System.out.println("You found a bomb!");
                    break;
            }
        } else {
            row = currentPosition[0];
            col = currentPosition[1];
        }
        matrix[row][col] = 's';
        sapperRow = row;
        sapperCol = col;
        return isOut;
    }

    private static boolean inBounds(int row, int col, char[][] matrix) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length;
    }

    private static char[][] readMatrix(Scanner scan, int n) {
        char[][] matrix = new char[n][n];
        for (int row = 0; row < matrix.length; row++) {
            String currentLine = scan.nextLine().replaceAll(" ", "");
            if (currentLine.contains("s")) {
                sapperRow = row;
                sapperCol = currentLine.indexOf("s");
            }
            matrix[row] = currentLine.toCharArray();
        }
        return matrix;
    }
}