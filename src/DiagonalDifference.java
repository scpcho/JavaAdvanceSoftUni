import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[size][];

        for (int i = 0; i < size; i++) {
            arr[i] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i][i];
        }
        for (int i = 0; i < size; i++) {
            sum -= arr[size - i - 1][i];
        }
        System.out.println(Math.abs(sum));
    }
}
