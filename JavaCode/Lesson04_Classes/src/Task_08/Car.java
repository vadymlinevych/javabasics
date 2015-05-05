package Task_08;

public class Car {
    static public int count = 0;
    protected String name;
    protected Engine engine; // мотор

    public Car(String name) {
        this.name = name;
        engine = new Engine(0);
        count++;
    }

    public Car(String name, double mileage) {
        this.name = name;
        engine = new Engine(mileage);
        count++;
    }

    public String getName() {
        return name;
    }

    public double getMileage() {
        return engine.getMileage();
    }
// завести мотор


    public void turnOn() {
        engine.turnOn();
    }

    // заглушить мотор
    public void turnOff() {
        engine.turnOff();
    }

    // установить скорость
    public void start(int speed, double hours) {
        if (!engine.isStarted()) // еще не заведен мотор
         return;
// пройденная дистанция
        double distance = hours * speed;
        engine.addMileage(distance);
    }
}
