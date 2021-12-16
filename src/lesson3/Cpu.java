package lesson3;

public class Cpu {
    double clockRate;
    int coreCount;
    int casheSize;

    public Cpu(double clockRate, int coreCount, int casheSize) {
        this.clockRate = clockRate;
        this.coreCount = coreCount;
        this.casheSize = casheSize;
    }

    public double getClockRate() {
        return clockRate;
    }

    public void setClockRate(double clockRate) {
        this.clockRate = clockRate;
    }

    public int getCoreCount() {
        return coreCount;
    }

    public void setCoreCount(int coreCount) {
        this.coreCount = coreCount;
    }

    public int getCasheSize() {
        return casheSize;
    }

    public void setCasheSize(int casheSize) {
        this.casheSize = casheSize;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "clockRate=" + clockRate +
                ", coreCount=" + coreCount +
                ", casheSize=" + casheSize +
                '}';
    }
}
