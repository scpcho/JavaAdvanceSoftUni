package src.PolymorphismEx.wildFarm.zebra;

import src.PolymorphismEx.wildFarm.Mammal;
import src.PolymorphismEx.wildFarm.food.Food;
import src.PolymorphismEx.wildFarm.food.Meat;

public class Zebra extends Mammal {
    public Zebra(String animalName, String animalType, Double animalWeight, String animalRegion) {
        super (animalName, animalType, animalWeight, animalRegion);
    }

    @Override
    protected
    void makeSound () {
        System.out.println ("Zs");
    }

    @Override
    protected
    void eat (Food food) {
        if (food instanceof Meat) {
            throw new IllegalArgumentException(
                    "Zebras are not eating that type of food!");
        }
        super.eat(food);
    }
}
