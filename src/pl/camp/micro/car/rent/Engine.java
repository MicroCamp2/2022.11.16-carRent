package pl.camp.micro.car.rent;

import pl.camp.micro.car.rent.authentication.Authenticator;
import pl.camp.micro.car.rent.database.CarRepository;
import pl.camp.micro.car.rent.database.UserRepository;
import pl.camp.micro.car.rent.gui.GUI;

public class Engine {
    private static final CarRepository carRepository = new CarRepository();
    private static final UserRepository userRepository = new UserRepository();
    private static final GUI gui = new GUI();

    private static final Authenticator authenticator = new Authenticator(userRepository);
    public static void start() {
        int loginCounter = 0;
        String choose = "3";
        while(loginCounter < 3 && choose.equals("3")) {
            choose = authenticator.authenticate(gui.loginInput()) ? "" : "3";
            loginCounter++;
        }


        while (!choose.equals("3")) {
            choose = gui.showMenu();
            switch (choose) {
                case "1":
                    gui.listCars(carRepository.getCars());
                    break;
                case "2":
                    gui.showRentResult(carRepository.rentCar(gui.plateInput()));
                    break;
                case "3":
                    break;

                default:
                    System.out.println("Wrong choose !!");
                    break;
            }
        }
    }
}
