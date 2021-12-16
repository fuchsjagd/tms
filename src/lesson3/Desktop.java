package lesson3;

public class Desktop extends Computer {
    String type;
    double cost;
    String brand;
    String model;
    int maxWorkingCount;

    public Desktop(String type, double cost, String brand, String model, int maxWorkingCount) {
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
        System.out.println("desktop is on, numberOfLives = " + maxWorkingCount);
    }

    @Override
    public void isOff() {
        maxWorkingCount -= 1;
        System.out.println("desktop is off, numberOfLives = " + maxWorkingCount);
    }

    @Override
    public void isDown() {
        maxWorkingCount = 0;
        System.out.println("desktop is down, bye");
    }

    @Override
    public void setAssembly() {
        Hdd hdd = new Hdd("hdd", 40, "Hitachi");
        Cpu cpu = new Cpu(2.4, 2, 128);
        Ram ram = new Ram(32, "SIMM");
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "type='" + type + '\'' +
                ", cost=" + cost +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", maxWorkingCount=" + maxWorkingCount +
                '}';
    }
}
