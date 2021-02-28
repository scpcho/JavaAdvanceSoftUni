package dealership;
import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private int capacity;
    private List<Car> cars;

    public Dealership(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.cars = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Car> getCar() {
        return cars;
    }

    public void add(Car car) {
        if (this.capacity > this.cars.size()) {
            this.cars.add(car);
        }
    }
    public boolean buy(String manufacture, String model) {
        return cars.removeIf(e -> e.getManufacture().equals(manufacture) && e.getModel().equals(model));
    }

    public Car getLatestCar() {
        Car car = null;
        for (Car e : cars) {
            if (car == null || car.getYear() < e.getYear()) {
                car = e;
            }
        }

        return car;
    }

    public Car getCar(String manufacture, String model) {
        for (Car car : cars) {
            if (car.getManufacture().equals(manufacture) && car.getModel().equals(model)) {
                return car;
            }
        }

        return null;
    }

    public int getCount() {
        return this.cars.size();
    }

    public String getStatistic() {
        StringBuilder out = new StringBuilder("The cars are in a car dealership" + name + ":");
        for (Car car : cars) {
            out.append(System.lineSeparator());
            out.append(car.toString());
        }

        return out.toString();
    }
}
