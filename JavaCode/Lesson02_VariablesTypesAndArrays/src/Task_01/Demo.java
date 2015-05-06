package Task_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 1. Упражнение «Конкатенация строк»
 a) Прочитать 3 строки  в переменные s1, s2, s3
 b) Вывести на экран конкатенацию: 1. S1 + s3 2. S3 + s2 + s1 3. S1 + s2 + s3

 */
public class Demo {
    public static void main(String[] args) throws IOException {

        BufferedReader d = new BufferedReader(new InputStreamReader(System.in));

        String s1 = d.readLine();
        String s2 = d.readLine();
        String s3 = d.readLine();

        System.out.println(s1 + s3);
        System.out.println(s3 + s2 + s1);
        System.out.println(s1 + s2 + s3);
    }
}
