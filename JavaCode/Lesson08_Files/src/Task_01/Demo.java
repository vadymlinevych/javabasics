package Task_01;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 1. Модифицировать проект FindFiles так, чтобы программа искала в каталоге все файлы с расширениями из списка.
 */
public class Demo {

    private static void findFiles(String srcPath, String ext, ArrayList<String> list) throws IOException {
        File dir = new File(srcPath);
        File[] files = dir.listFiles(new MyFileFilter(ext)); // пример интерфейса из стандартной библиотеки
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {

                findFiles(srcPath + files[i].getName() + "\\" ,".txt", list);

            }  else {
                list.add(srcPath + files[i].getName());
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        try {
            findFiles("e:\\Temp\\", ".txt", list);
        } catch (IOException ex) {
        }
        for (String s : list) System.out.println(s);
    }

}
