package Task_02;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 2. Разобраться с java.io.BufferedInputStreamи java.io. BufferedOutputStream.
 Подумать как улучшить программу №3 с помощью этих классов
 */

public class Demo {

    public static void main(String[] args) throws Exception {
        String source = "e:\\rez.txt";
        String destination = "e:\\rez1.txt";
        copyFile(source, destination);
    }

    public static void copyFile(String src, String dest) throws Exception {

       // FileInputStream in = new FileInputStream(src);
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(src));

        try {
            //FileOutputStream out = new FileOutputStream(dest);
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dest));

            try {
                byte[] buf = new byte[1024]; // 1 KB
                int r;

                do {
                    //r = in.read(buf, 0, buf.length);
                    r = in.read(buf, 0, buf.length);
                    if (r > 0) out.write(buf, 0, r);
                } while (r > 0);
            } finally {
                out.close();
            }
        } finally {
            in.close();
        }
    }

}
