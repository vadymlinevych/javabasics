package Lesson09_LinesReader;

import java.io.File;
import java.util.Date;

public class LinesReaderDemo {

    public static void main(String[] args) {
        reader.setEvents(new Events1());  //Events1
        callReadNTimes(3);

        System.out.println("--------------");

        Events2 ev2 = new Events2();
        reader.setEvents(ev2);  //Events2

        callReadNTimes(2);
    }

    private static void callReadNTimes(int n) {
        System.out.printf("Enter %d lines:%n", n);
        while (n-- > 0) {
            reader.read();
        }

    }

    public Date getCreationDate(File f) {
        return new Date(f.lastModified());
    }

    private static LinesReader reader = new LinesReader();
}
