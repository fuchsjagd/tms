package lesson3;

import java.util.Objects;

public abstract class Computer {
    String type;
    double cost;
    String brand;
    String model;
    int maxWorkingCount;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
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

    public int getMaxWorkingCount() {
        return maxWorkingCount;
    }

    public void setMaxWorkingCount(int maxWorkingCount) {
        this.maxWorkingCount = maxWorkingCount;
    }

    public abstract void isOn();

    public abstract void isOff();

    public abstract void isDown();

    public abstract void setAssembly();
}
