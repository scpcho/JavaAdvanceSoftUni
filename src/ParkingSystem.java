import java.util.Arrays;
import java.util.Scanner;

public class ParkingSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] data = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int n = data[0];
        int m = data[1];
        boolean[][] isOccupied = new boolean[data[0]][data[1]];
        for (int i = 0; i < isOccupied.length; i++) {
            isOccupied[i][0] = true;
        }

        String input = scanner.nextLine();
        while (!"stop".equals(input)) {
            String[] tokens = input.split("\\s+");
            int entryRow = Integer.parseInt(tokens[0]);
            int targetRow = Integer.parseInt(tokens[1]);
            int targetCol = Integer.parseInt(tokens[2]);
            boolean hasFoundPlace = false;

            int travelDistance = 1;
            travelDistance += Math.abs(targetRow - entryRow);

            if (!isOccupied[targetRow][targetCol]) {
                travelDistance += targetCol;
                isOccupied[targetRow][targetCol] = true;
                hasFoundPlace = true;
            } else {
                for (int i = 1; i < isOccupied[targetRow].length; i++) {
                    if (targetCol - i > 0 && !isOccupied[targetRow][targetCol - i]) {
                        isOccupied[targetRow][targetCol - i] = true;
                        hasFoundPlace = true;
                        travelDistance += targetCol - i;
                        break;
                    }
                    if (targetCol + i < isOccupied[targetRow].length && !isOccupied[targetRow][targetCol + i]) {
                        isOccupied[targetRow][targetCol + i] = true;
                        hasFoundPlace = true;
                        travelDistance += targetCol + i;
                        break;

                    }
                }
            }
            if (hasFoundPlace) {
                System.out.println(travelDistance);
            } else {
                System.out.println(String.format("Row %d full", targetRow));
            }
            input = scanner.nextLine();
        }
    }
}
