package lesson3;

import java.util.Objects;

public class Laptop extends Computer {
    String type;
    double cost;
    String brand;
    String model;
    int maxWorkingCount;


    public Laptop(String type, double cost, String brand, String model, int maxWorkingCount) {
        this.type = type;
        this.cost = cost;
        this.brand = brand;
        this.model = model;
        this.maxWorkingCount = maxWorkingCount;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public int getMaxWorkingCount() {
        return maxWorkingCount;
    }

    @Override
    public void setMaxWorkingCount(int maxWorkingCount) {
        this.maxWorkingCount = maxWorkingCount;
    }

    @Override
    public void isOn() {
        maxWorkingCount -= 1;
        System.out.println("laptop is on, numberOfLives = " + maxWorkingCount);
    }

    @Override
    public void isOff() {
        maxWorkingCount -= 1;
        System.out.println("laptop is off, numberOfLives = " + maxWorkingCount);
    }

    @Override
    public void isDown() {
        maxWorkingCount = 0;
        System.out.println("laptop is down, bye");
    }

    @Override
    public void setAssembly() {
        Hdd hdd = new Hdd("hdd", 500, "samsung");
        Cpu cpu = new Cpu(2.6, 2, 128);
        Ram ram = new Ram(32, "DDR3");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.cost, cost) == 0 && maxWorkingCount == laptop.maxWorkingCount && Objects.equals(type, laptop.type) && Objects.equals(brand, laptop.brand) && Objects.equals(model, laptop.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, cost, brand, model, maxWorkingCount);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "type='" + type + '\'' +
                ", cost=" + cost +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", maxWorkingCount=" + maxWorkingCount +
                '}';
    }
}
