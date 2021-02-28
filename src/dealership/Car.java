package dealership;

public class Car {
    private String manufacture;
    private String model;
    int year;

    public Car(String manufacture, String model, int year) {
        this.manufacture = manufacture;
        this.model = model;
        this.year = year;

    }

    public String getManufacture() {
        return manufacture;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return getManufacture() + getModel() + getYear();
    }
}
