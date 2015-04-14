package Task_03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadShowTime extends Thread {

    @Override
    public void run() {

        while (!isInterrupted()) {
            Date curTime = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

            try {
                System.out.println(dateFormat.format(curTime.getTime()));

                Thread.sleep(10000);
            } catch (Exception e) {
                return;
            }
        }
    }

}
