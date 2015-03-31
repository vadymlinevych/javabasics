package Lesson08_LinesReader;

public class Events1 implements IEvents {
    public void onNewLine(String line) {
        System.out.println("New line: " + line);
    }

    public void onError(String msg) {
        System.out.println("Error: " + msg);
    }
}
