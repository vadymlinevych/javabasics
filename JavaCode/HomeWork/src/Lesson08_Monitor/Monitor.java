package Lesson09_Monitor;

/**
 * Created by Admin on 3/19/2015.
 */

import java.io.File;
import java.util.Date;

public class Monitor {
    String file;
    IFileEvent event;
    File f;

    public Monitor(String file, IFileEvent event) {
        this.file = file;
        this.event = event;
    }

    public void start() {
        f = new File(file);
        while (true) {
            if (f.exists() && f.isFile()) {
                if (event != null) event.onFileAdded(file);
                break;
            }
            delay(); // задержка System.out.println("Waiting...");
        } }
    private void delay () {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted!");
            System.err.println("Thread interrupted!");
        }
    }

    public Date getDateCreation(){
       return new Date(f.lastModified());
    }
}


 interface IFileEvent {
    void onFileAdded(String s);
}

 class FileEvent implements IFileEvent {
    @Override
    public void onFileAdded(String s) {
        System.out.println("File added: " + s);
    }
}