package Task_04;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 4. Распарсить следующую структуру данных:
 { “name”: “Vasia”, “surname”: “Pupkin”, “phones”: [“044-123-45-67”, “066-123-45-67”, …],
 “sites”: [“http://site1.com”, “http://site2.com”, …], “address”: { “country”: “Ukraine”, “city”: “Kiev”, “street”: “Pobedy” } }

 */
public class Demo {
    public static void main(String[] args) {

        String path = "D:\\dir\\person.txt";
        String result = null;
        try {
            result = fileToText(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Gson gson = new GsonBuilder().create();
        Person person = gson.fromJson(result, Person.class);

        //Выводим на экран все
        System.out.println(person.toString());
    }

    public static String fileToText(String path) throws IOException {

        try (RandomAccessFile raf = new RandomAccessFile(path, "r")){
            byte[] buf = new byte[(int) raf.length()];
            raf.read(buf);
            return new String(buf);
        }
    }
}
