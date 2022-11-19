package pl.camp.micro.car.rent.model;

public class Car {
    private String brand;
    private String model;
    private double price;
    private String plate;
    private boolean rent;

    public Car(String brand, String model, double price, String plate) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.plate = plate;
        this.rent = false;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public boolean isRent() {
        return rent;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(this.brand)
                .append(" ")
                .append(this.model)
                .append(" Cena: ")
                .append(this.price)
                .append(" Plate: ")
                .append(this.plate)
                .append(" Available: ")
                .append(this.rent ? "No" : "Yes")
                .toString();
    }
}
