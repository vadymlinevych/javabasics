package Task_01;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Date;

public class Events2 implements IEvents {
    public void onNewLine(String line) {
        String s = line + "\r\n"; //
        try {
            RandomAccessFile r = new RandomAccessFile("c:\\1.txt", "rw");
            try {
                r.seek(r.length());
                r.write(s.getBytes());
            } finally {
                r.close();
            }
        } catch (Exception ex) {}
    }

    public void onError(String msg){

    }

    public  Date getCreationDate(File f) {
        return new Date(f.lastModified());
    }

}

