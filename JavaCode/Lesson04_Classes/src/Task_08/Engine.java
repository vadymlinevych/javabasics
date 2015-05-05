package Task_08;

public class Engine { // число пройденных миль
    protected double mileage = 0;
    protected boolean started;

    public Engine(double mileage) {
        this.mileage = mileage;
    }

    public double getMileage() {
        return mileage;
    }

    public void addMileage(double mileage) {
        if (started) this.mileage += mileage;
    }

    public boolean isStarted() {
        return started;
    }

    public void turnOn() {
        started = true;
    }

    public void turnOff() {
        started = false;
    }
}