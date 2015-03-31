/**
 * Created by Admin on 3/10/2015.
 */
public class SamsungS4 extends Phone {

    public SamsungS4() {
        System.out.println("SamsungS4 constructor");

        touch = false;
        hasWifi = false;
        screenSize = 5;
    }

    public void call(String number) {
        super.call(number);
        System.out.println("SamsungS4 class is calling " + number);
    }

    @Override
    public void sendSMS(String number, String message) {
        super.sendSMS(number, message);
        message = "Hello!" + message;
        System.out.println("SamsungS4 class is sending sms " + message + " to " + number);
    }
}
