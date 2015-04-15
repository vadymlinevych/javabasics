package Task_06_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Copier {

    public void copyBlocks(String src, String dest)
            throws FileNotFoundException {
        File f1 = new File(src);
        File f2 = null;
        if (f1.isFile() && f1.exists()) {
            if (dest.endsWith("\\")) {
                f2 = new File(dest + f1.getName());
            } else {
                f2 = new File(dest + "\\" + f1.getName());
            }
            try {
                f2.createNewFile();
            } catch (IOException e) {
                System.out.println("File was not created");
            }
            int blockSize = (int) Math.ceil(f1.length() / 4);
            long bgn = 0;
            for (int i = 0; i < 4; i++) {
                ThreadCopy t = new ThreadCopy(f1, f2, bgn,
                        blockSize);
                t.start();
                try {
                    t.sleep(500);//just to see the progress...
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bgn += blockSize;
            }

        } else {
            throw new FileNotFoundException("No such file");
        }

    }
}