package Task_04;

/**
 * Created by Admin on 4/14/2015.
 */
public class ThreadGetInfo extends Thread {

    ThreadGetInfo(ThreadGroup tg, String name) { //name of thread and group
        super(tg, name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " | " + getId()); // вывод на консоль имени и номера потока
        while (!isInterrupted()) ; // ожидание завершения

    }

}


