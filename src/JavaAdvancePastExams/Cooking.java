package JavaAdvancePastExams;

import java.util.*;
import java.util.stream.Collectors;

public class Cooking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> liquids = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> ingredients = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .forEach(ingredients::push);

        Map<Integer, String> cookingTable = new HashMap<>();
        cookingTable.put(25, "Bread");
        cookingTable.put(50, "Cake");
        cookingTable.put(75, "Pastry");
        cookingTable.put(100, "Fruit Pie");

        Map<String, Integer> productsCook = new TreeMap<>();

        cookingTable.values().forEach(p -> productsCook.put(p, 0));



        while (!liquids.isEmpty() && !ingredients.isEmpty()) {
            Integer currentLiquid = liquids.poll();
            Integer currentIngredients = ingredients.pop();

            int sum = currentLiquid + currentIngredients;
            if (ableToCookProduct(sum)) {
                String product = cookingTable.get(sum);
                productsCook.put(product, productsCook.get(product) + 1);
            } else {
                ingredients.push(currentIngredients + 3);
            }
        }
        if (hasCoockedEachMeal(productsCook)) {
            System.out.println("Wohoo! You succeeded in cooking all the food!");
        } else {
            System.out.println("Ugh, what a pity! " + "You didn't have enough materials to to cook everything.");

        }

        System.out.println("Liquids left: " + getElementInfo(liquids));
        System.out.println("Ingredients left: " + getElementInfo(ingredients));

        productsCook.forEach((k, v) -> {
            System.out.println(k + ": " + v);
        });
    }

    private static String getElementInfo(ArrayDeque<Integer> deque) {
        return deque.isEmpty()
                ? "none"
                : deque
                .stream()
                .map(String :: valueOf)
                .collect(Collectors.joining(", "));
    }

    private static boolean hasCoockedEachMeal(Map<String, Integer> productsCook) {
        return
              productsCook.values().stream().noneMatch(c -> c == 0);

    }

    private static boolean ableToCookProduct(int sum) {
        return sum == 25 || sum == 50 || sum == 75 || sum == 100;

    }
}
