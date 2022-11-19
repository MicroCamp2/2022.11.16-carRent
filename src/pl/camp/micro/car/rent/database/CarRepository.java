package pl.camp.micro.car.rent.database;

import pl.camp.micro.car.rent.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRepository {
    private final List<Car> cars = new ArrayList<>();

    public CarRepository() {
        this.cars.add(new Car("Audi", "A5", 300.0, "KR11"));
        this.cars.add(new Car("BMW", "3", 250.0, "KR22"));
        this.cars.add(new Car("Toyota", "Corolla", 200.0, "KR33"));
        this.cars.add(new Car("Kia", "Ceed", 200.0, "KR44"));
    }

    public boolean rentCar(String plate) {
        for(Car car : this.cars) {
            if(car.getPlate().equals(plate) && !car.isRent()) {
                car.setRent(true);
                return true;
            }
        }

        return false;
    }

    public List<Car> getCars() {
        return cars;
    }
}
