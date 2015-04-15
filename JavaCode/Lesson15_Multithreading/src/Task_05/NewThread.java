package Task_05;

public class NewThread extends Thread {

    @Override
    public void run() {

        System.out.println(getName() + " started");

        while (!isInterrupted()) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                break;
            }
        }
        System.out.println(getName() + " interrupted");
    }
}


