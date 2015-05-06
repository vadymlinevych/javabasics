package Task_05;

/**
 * 5. Написать код для связи телефонов между собой. У каждого телефона будет свой номер.
 * При вызове call(x) телефон должен найти собеседника по номеру x из всех доступных в данный момент телефонов )
 * из всех созданных объектов типа Phone) и вызвать его метод answer().
 */
public class Demo {
    public static void main(String args[]) {
        Nokia3310 nokia = new Nokia3310();
        System.out.println("Nokia3310 screent size: " + nokia.getScreenSize());
        nokia.call("123-45-67");
        nokia.sendSMS("567-78-89", "text message");

        System.out.println("----------------------------------");

        IPhone iphone = new IPhone();
        System.out.println("IPhone screent size: " + iphone.getScreenSize());
        iphone.call("123-45-67");
        iphone.sendSMS("567-78-89", "text message");

        System.out.println("----------------------------------");

        IPhone5 iphone5 = new IPhone5();
        System.out.println("IPhone screent size: " + iphone5.getScreenSize());
        iphone5.call("123-45-67");
        iphone5.sendSMS("567-78-89", "text message");
    }
}
