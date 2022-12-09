package pl.camp.micro.car.rent.database;

import pl.camp.micro.car.rent.model.Car;

import java.util.List;

public interface ICarRepository {
    List<Car> getCars();
    boolean rentCar(String plate);
}
