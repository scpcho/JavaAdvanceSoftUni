package GenericsEx.CustomListSorter;


import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input;
        CustomBox<String> box = new CustomBox<>();
        while (!"END".equals(input = scan.nextLine())) {
            String[] command = input.split("\\s+");
            switch (command[0]) {
                case "Add":
                    box.add(command[1]);
                    break;
                case "Remove":
                    box.remove(Integer.parseInt(command[1]));
                    break;
                case "Contains":
                    System.out.println(box.contains(command[1]));
                    break;
                case "Swap":
                    box.swap(Integer.parseInt(command[1]), Integer.parseInt(command[2]));
                    break;
                case "Greater":
                    System.out.println(box.countGreaterThan(command[1]));
                    break;
                case "Max":
                    System.out.println(box.getMax());
                    break;
                case "Min":
                    System.out.println(box.getMin());
                    break;
                case "Print":
                    box.printData();
                    break;
                case"Sort":
                    Sorter.sort(box.toSort());
            }
        }
    }
}