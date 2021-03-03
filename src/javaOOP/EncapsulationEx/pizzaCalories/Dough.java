package src.javaOOP.EncapsulationEx.pizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight){
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    private void setFlourType(String flourType) {
        //"Invalid type of dough.".
        if(!"White".equals(flourType) && !"Wholegrain".equals(flourType)) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.flourType = flourType;
    }

    private void setBakingTechnique(String bakingTechnique) {
        if(!"Crispy".equals(bakingTechnique) &&
                !"Chewy".equals(bakingTechnique) &&
                !"Homemade".equals(bakingTechnique)){
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.bakingTechnique = bakingTechnique;
    }

    private void setWeight(double weight) {
        if(weight < 1 || weight > 200){
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    public double calculateCalories(){
        double w = this.weight * 2;
        double t = getModifiersByBakingTechnique(this.bakingTechnique);
        double f = getModifiersByFlourType(this.flourType);
        //  double sum = (this.weight * 2) * getModifiersByBakingTechnique(this.bakingTechnique) * getModifiersByFlourType(this.flourType);
        double sum = w * t * f;
        return sum;
    }

    private double getModifiersByBakingTechnique(String bakingTechnique) {
        switch (bakingTechnique) {
            case "Crispy":
                return 0.9;
            case "Chewy":
                return 1.1;
            case "Homemade":
                return 1.0;
            default:
                return 0.0;
        }
    }

    private double getModifiersByFlourType(String flourType) {
        switch (flourType) {
            case "White":
                return 1.5;
            case "Wholegrain":
                return 1.0;
            default:
                return 0.0;
        }
    }
}