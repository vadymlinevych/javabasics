package Task_04;

public class ThreadGetInfo extends Thread {

    @Override
    public void run() {
        System.out.println(getName() + " | " + getId());
        while (!isInterrupted()) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted");
                return;
            }
        }
    }
}


