package Task_05;

/**
 Написать класс «автомобиль» Car,
 который должен уметь заводится on(), глушить мотор off(), ехать go()
 и держать необходимую скорость setSpeed(int speed)
 */
public class Demo {

    public static void main(String args[]) {

        Car ford = new Car();
        ford.setName("Ford");
        System.out.println("1-st car - " + ford.getName() + "!");

        ford.on();
        ford.go();
        ford.setSpeed(60);
        ford.off();

        System.out.println("");

        Car toyota = new Car();
        toyota.setName("Toyota");
        System.out.println("2-nd car - " + toyota.getName() + "!");

        toyota.on();
        toyota.go();
        toyota.setSpeed(120);
        toyota.off();
    }
}
