package Exam;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> firstMagicBox = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> secondMagicBox = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));


        int[] collected = new int[100];
        int i = 0;

        while (!firstMagicBox.isEmpty() && !secondMagicBox.isEmpty()) {
            Integer firstElement;
            firstElement = firstMagicBox.pollFirst();
            Integer lastElement;
            lastElement = secondMagicBox.pollLast();

            int sum = firstElement + lastElement;
            if (sum % 2 == 0) {
                collected[i] = sum;
                i++;
            } else {
                firstMagicBox.addLast(lastElement);
                firstMagicBox.addFirst(firstElement);
            }
        }

        if (firstMagicBox.isEmpty()) {
            System.out.println("First magic box is empty.");
        } else {
            System.out.println("Second magic box is empty.");
        }

        int summed = 0;
        for (int j = 0; j < i; j++) {
            summed = summed + collected[j];
        }
         if (summed >= 90) {
             System.out.println("Wow, your prey was epic! Value: " + summed);
         } else {
             System.out.println("Poor prey... Value: " + summed);
         }
    }
}
