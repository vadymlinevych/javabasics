package Lesson09_Monitor;

public class MonitorDemo {

    public static void main(String[] args) {
        Monitor m = new Monitor("e:\\1.txt", new FileEvent());
        m.start();
        System.out.println(m.getDateCreation());
    }



    }
