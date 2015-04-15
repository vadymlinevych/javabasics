package Task_06_07;

import java.io.FileNotFoundException;

/**
 * 6. Копирование файла блоками (1 поток на блок).
 * 7. Написать программу копирования файла с выводом прогресса в % на консоль.
 */
public class Demo {

    public static void main(String[] args) {
        Copier c = new Copier();
        try {
            c.copyBlocks("E:\\Pretty.Woman.1990.dvdrip_[2.18]_eng.ac3", "E:\\JavaTemp");
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }

    }

}
