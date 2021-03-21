package src.PolymorphismEx.wildFarm.food;

public abstract class Food {
    private  int quantity;

    protected Food(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
