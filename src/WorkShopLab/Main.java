package WorkShopLab;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack();

        for (int i = 0; i < 10; i++) {
            stack.push(i + 1);
        }

        stack.forEach(e -> System.out.println(e));
    }
}