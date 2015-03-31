package Lesson_10_EnumInnerClassesSerialization.Task_01_02_03;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 1. Добавить в класс «человек» константы: пол, темперамент.
 2. Реализовать возможность сериализации для класса «человек».
 3. Написать программу, которая запросит ввести с консоли информацию о 10 людях,
 запишет ее на диск, а при следующем старте прочитает записи и выведет сохраненные данные на экран.
 Одинаковые записи должны игнорироваться (Set + equals*).
 */
public class Demo_Task_01_02_03 {

    static final String PATH_TO_FILE = "e:\\db.dat";

    public static void main(String[] args) {
        int n; //number of people
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        Set<Man> manList = new HashSet<Man>();

        for (int i = 0; i < n; i++) {
            Man newMan = inputMan();
            manList.add(newMan);
        }

        saveToDisk(manList);

        Set<Man> resultList  = readFromDisk();

        for (Man manResult : resultList) {
           System.out.println(manResult.toString());
        }

    }

    private static void saveToDisk(Set<Man> manList) {
        try {
            FileOutputStream fos = new FileOutputStream(PATH_TO_FILE);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (Man man : manList) {
                oos.writeObject(man);
            }
            oos.close();

        } catch (IOException ex) {
        }
    }

    private static Set<Man> readFromDisk() {

        Set<Man> manList = new HashSet<Man>();

        try {
            FileInputStream fis = new FileInputStream(PATH_TO_FILE);
            ObjectInputStream ois = new ObjectInputStream(fis);

            Man man;

            Object ob;
            while (fis.available() > 0) {
                man = (Man) ois.readObject();
                manList.add(man);
            }

            ois.close();

        } catch (IOException ex) {

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        }

        return manList;
    }


    static Man inputMan() {

        Man man = new Man();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the sex");
        man.setSex(Sex.valueOf(sc.next()));
        System.out.println("Input the temperament");
        man.setTemperament(Temperament.valueOf(sc.next()));

        return man;
    }

}
