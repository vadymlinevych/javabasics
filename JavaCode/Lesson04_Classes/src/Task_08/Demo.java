package Task_08;

/**
 * 8. Модифицировать пример Cars: добавить свойство «расход топлива»;
 * написать код для вывода потраченного топлива на экран
 */
public class Demo {
    public static void main(String[] args) {
        try {
            final Car bmw = new Car("BMW");
            final Car ferrari = new Car("Ferrari", 20000);
            bmw.turnOn();
            ferrari.turnOn();
            int[] speeds = {20, 60, 100};
            for (int s : speeds) bmw.start(s, 0.5);
            for (int s : speeds) ferrari.start(s, 1);
/* for (int i = 0; i < speeds.length; i++) { int s = speeds[i]; bmw.start(s, 0.5); } */
            bmw.turnOff();
            ferrari.turnOff();
            System.out.println("Cars count: " + Car.count);
            System.out.println(bmw.getName() + ": " + bmw.getMileage());
            System.out.println(ferrari.getName() + ": " + ferrari.getMileage());
        } catch (Exception ex) {
            System.out.println("Error!");
        }
    }

}
