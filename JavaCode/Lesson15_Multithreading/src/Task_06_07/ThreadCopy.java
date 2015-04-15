package Task_06_07;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ThreadCopy extends Thread {

    File src, dest;
    long bgn;
    int blockSize;
    RandomAccessFile in, out;

    public ThreadCopy(File src, File dest, long bgn,
                      int blockSize) {
        this.src = src;
        this.dest = dest;
        this.bgn = bgn;
        this.blockSize = blockSize;
    }

    @Override
    public void run() {
        ProgressBar p = new ProgressBar();
        try {
            in = new RandomAccessFile(src, "r");
            try {
                out = new RandomAccessFile(dest, "rw");
                try {

                    byte[] buf = new byte[blockSize];
                    int r = 0;
                    in.seek(bgn);
                    r = in.read(buf, 0, buf.length);
                    if (r > 0) {
                        p.progress(src, r);
                        out.seek(bgn);
                        out.write(buf, 0, r);
                    }
                } finally {
                    out.close();
                }

            } finally {
                in.close();
            }
        } catch (IOException e) {
            System.out.println("IO Exeption");
        }

    }

}
