package Lesson_09_IO.Task_03;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

/**
 * 3. Написать программу, которая скопирует несколько файлов в один.
 * Подумать как для этого использовать java.io.SequenceInputStream
 */

public class Task_03 {


    public static void main(String[] args) throws Exception {

        FileInputStream fis1 = new FileInputStream("e:\\1.txt");
        FileInputStream fis2 = new FileInputStream("e:\\2.txt");
        FileInputStream fis3 = new FileInputStream("e:\\3.txt");

        FileOutputStream out = new FileOutputStream("e:\\out.txt");

        Vector<InputStream> inputStreams = new Vector<InputStream>();
        inputStreams.add(fis1);
        inputStreams.add(fis2);
        inputStreams.add(fis3);

        Enumeration<InputStream> enu = inputStreams.elements();
        SequenceInputStream sis = new SequenceInputStream(enu);

        int oneByte;
        while ((oneByte = sis.read()) != -1) {
            System.out.write(oneByte);
            out.write(oneByte);
        }
        System.out.flush();
        out.close();
    }

}
