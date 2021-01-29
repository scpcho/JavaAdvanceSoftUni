import java.util.*;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<Character, Integer> charOcurrences = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            //ver.1
            if (!charOcurrences.containsKey(symbol)) {
                charOcurrences.put(symbol, 1);
            } else {
                charOcurrences.put(symbol, charOcurrences.get(symbol) + 1);
            }
            //ver.2
            //charOcurrences.putIfAbsent(symbol, 0);
            //charOcurrences.put(symbol, charOcurrences.get(symbol) + 1);

            //ver.3
            //int currentValue = charOcurrences.getOrDefault(symbol, 0);
            //charOcurrences.put(symbol, currentValue + 1);
        }

        for (Map.Entry<Character, Integer> entry : charOcurrences.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();
            System.out.println(String.format("%c: %d time/s", key, value));

        }
    }
}
