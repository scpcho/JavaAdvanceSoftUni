package src.PolymorphismEx.wildFarm;

import src.PolymorphismEx.wildFarm.feline.Cat;
import src.PolymorphismEx.wildFarm.feline.Tiger;
import src.PolymorphismEx.wildFarm.food.Food;
import src.PolymorphismEx.wildFarm.food.Meat;
import src.PolymorphismEx.wildFarm.food.Vegetable;
import src.PolymorphismEx.wildFarm.mouse.Mouse;
import src.PolymorphismEx.wildFarm.zebra.Zebra;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        List<Animal> animals = new ArrayList<>();


        String input = scanner.nextLine();
        while (!"End".equals(input)) {
            String[] tokens = input.split("\\s+");
            Animal animal = createAnimal(tokens);

            String[] provideFood = scanner.nextLine().split("\\s+");
            Food food = createFood(provideFood);

            animal.makeSound();
            try {
                animal.eat(food);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
            animals.add(animal);

            input = scanner.nextLine();
        }
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }


    private static Animal createAnimal(String[] tokens) {
        String animalType = tokens[0];
        String animalName = tokens[1];
        Double animalWeight = Double.parseDouble(tokens[2]);
        String livingRegion = tokens[3];
        Animal animal;

        switch (animalType) {
            case "Cat":
                animal = new Cat(animalName, animalType, animalWeight, livingRegion, tokens[4]);
                break;
            case "Tiger":
                animal = new Tiger(animalName, animalType, animalWeight, livingRegion);
                break;
            case "Zebra":
                animal = new Zebra(animalName, animalType, animalWeight, livingRegion);
                break;
            case "Mouse":
                animal = new Mouse(animalName, animalType, animalWeight, livingRegion);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + animalType);
        }
        return animal;
    }


    private static Food createFood(String[] provideFood) {
        String foodName = provideFood[0];
        Integer foodWeight = Integer.parseInt(provideFood[1]);

        return foodName.equals("Meat") ? new Meat(foodWeight) : new Vegetable(foodWeight);
    }
}
