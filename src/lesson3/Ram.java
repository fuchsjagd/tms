package lesson3;

public class Ram {
    int capacity;
    String type;

    public Ram(int capacity, String type) {
        this.capacity = capacity;
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "capacity=" + capacity +
                ", type='" + type + '\'' +
                '}';
    }
}
