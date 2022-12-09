package pl.camp.micro.car.rent;

import pl.camp.micro.car.rent.authentication.Authenticator;
import pl.camp.micro.car.rent.database.CarRepository;
import pl.camp.micro.car.rent.database.CarRepository2;
import pl.camp.micro.car.rent.database.ICarRepository;
import pl.camp.micro.car.rent.gui.GUI;

public class Engine {
    private static final ICarRepository carRepository = CarRepository2.getInstance();
    private static final GUI gui = GUI.getInstance();
    private static final Authenticator authenticator = Authenticator.getInstance();
    private final static Engine instance = new Engine();

    private Engine() {
    }
    public void start() {
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
                    gui.listCars();
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

    public static Engine getInstance() {
        return instance;
    }
}
