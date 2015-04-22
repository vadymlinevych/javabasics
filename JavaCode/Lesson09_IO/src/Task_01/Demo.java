package Task_01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

/**
 1. Написать программу, которая создаст текстовый файл
 и запишет в него список файлов (путь, имя, дата создания) из заданного каталога.
 */

public class Demo {

    private static void findFiles(String srcPath, String ext, ArrayList<String> list, FileWriter fw) throws IOException {
        File dir = new File(srcPath);
        File[] files = dir.listFiles(new MyFileFilter(ext)); // пример интерфейса из стандартной библиотеки


        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {

                findFiles(srcPath + files[i].getName() + "\\", ".txt", list, fw);

            } else {
                String path = srcPath + files[i].getName();
                list.add(path);
                fw.write(path + " " + new Date(files[i].lastModified()) + "\r\n");

            }
        }


    }

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("e:\\rez.txt");

        ArrayList<String> list = new ArrayList<String>();
        try {
            findFiles("e:\\Temp\\", ".txt", list, fw);
        } catch (IOException ex) {
        }
        for (String s : list) System.out.println(s);

        fw.close();
    }

}
