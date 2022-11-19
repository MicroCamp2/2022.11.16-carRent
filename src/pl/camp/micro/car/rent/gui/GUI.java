package pl.camp.micro.car.rent.gui;

import pl.camp.micro.car.rent.model.Car;
import pl.camp.micro.car.rent.model.User;

import java.util.List;
import java.util.Scanner;

public class GUI {

    private final Scanner scanner = new Scanner(System.in);
    public String showMenu() {
        System.out.println("1. List cars");
        System.out.println("2. Rent car");
        System.out.println("3. Exit");
        return this.scanner.nextLine();
    }

    public void listCars(List<Car> cars) {
        for(Car car : cars) {
            System.out.println(car);
        }
    }

    public String plateInput() {
        System.out.println("Type plate:");
        return this.scanner.nextLine();
    }

    public void showRentResult(boolean rentResult) {
        if(rentResult) {
            System.out.println("Rent success !!");
        } else {
            System.out.println("Rent error !!");
        }
    }

    public User loginInput() {
        User user = new User();
        System.out.println("Login:");
        user.setLogin(this.scanner.nextLine());
        System.out.println("Password:");
        user.setPassword(this.scanner.nextLine());
        return user;
    }
}
