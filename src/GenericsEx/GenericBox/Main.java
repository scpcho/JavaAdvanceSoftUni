package GenericsEx.GenericBox;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        final int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            int digit = Integer.parseInt(scan.nextLine());
            Box<Integer> box = new Box<>(digit);
            System.out.println(box);
        }
    }
}