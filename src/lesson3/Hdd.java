package lesson3;

public class Hdd {
    String type;
    int capacity;
    String brand;

    public Hdd(String type, int capacity, String brand) {
        this.type = type;
        this.capacity = capacity;
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Hdd{" +
                "type='" + type + '\'' +
                ", capacity=" + capacity +
                ", brand='" + brand + '\'' +
                '}';
    }
}
