package Lesson_09_IO.Task_01;

import java.io.File;
import java.io.FilenameFilter;


class MyFileFilter implements FilenameFilter {
    private String ext;

    public MyFileFilter(String ext) {
        this.ext = ext;
    }

    // оптимизируйте код
    public boolean accept(File dir, String name) {
        return name.endsWith(ext) || dir.isDirectory();
    }
}

