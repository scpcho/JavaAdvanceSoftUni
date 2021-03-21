package src.PolymorphismEx.wildFarm.mouse;

import src.PolymorphismEx.wildFarm.Mammal;
import src.PolymorphismEx.wildFarm.food.Food;
import src.PolymorphismEx.wildFarm.food.Meat;

public class Mouse extends Mammal {
    public Mouse(String animalName, String animalType, Double animalWeight, String animalRegion) {
        super (animalName, animalType, animalWeight, animalRegion);
    }

    @Override
    protected
    void makeSound () {
        System.out.println ("SQUEEEAAAK!");
    }

    @Override
    protected
    void eat (Food food) {
        if (food instanceof Meat) {
            throw new IllegalArgumentException(
                    "Mice are not eating that type of food!");
        }
        super.eat(food);
    }
}
