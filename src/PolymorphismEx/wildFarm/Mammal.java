package src.PolymorphismEx.wildFarm;

public abstract class Mammal extends Animal {
    private String livingRegion;

    protected
    Mammal (String animalName, String animalType, Double animalWeight, String animalRegion) {
        super (animalName, animalType, animalWeight, animalRegion);
    }
}
