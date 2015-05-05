package Task_08;

public class Car {

    private String name;
    private int speed;

    public void setName(String s) {
        this.name = s;
    }

    public String getName() {
        return name;
    }

    public void on() {
        System.out.println(name + " The car switched on.");
    }

    public void off() {
        System.out.println(name + " The car switched off.");
    }

    public void go() {
        System.out.println(name + " The car is going.");
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println(name + " The car is going with the speed " + speed + " km per hour");
    }
}