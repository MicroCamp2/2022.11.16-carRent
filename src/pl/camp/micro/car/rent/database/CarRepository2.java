package pl.camp.micro.car.rent.database;

import pl.camp.micro.car.rent.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRepository2 implements ICarRepository {
    private final List<Car> cars = new ArrayList<>();

    private final static CarRepository2 instance = new CarRepository2();

    private CarRepository2() {
        this.cars.add(new Car("Audi", "A5", 300.0, "KR111"));
        this.cars.add(new Car("BMW", "3", 250.0, "KR222"));
        this.cars.add(new Car("Toyota", "Corolla", 200.0, "KR333"));
        this.cars.add(new Car("Kia", "Ceed", 200.0, "KR444"));
    }

    @Override
    public boolean rentCar(String plate) {
        for(Car car : this.cars) {
            if(car.getPlate().equals(plate) && !car.isRent()) {
                car.setRent(true);
                return true;
            }
        }

        return false;
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

    public static CarRepository2 getInstance() {
        return instance;
    }
}
