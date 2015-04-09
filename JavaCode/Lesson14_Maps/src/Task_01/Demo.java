package Task_01;

import java.util.Scanner;

/**
 * 1. Написать программу переводчик, которая будет переводить текст,
 * написанный на одном языке,
 * на другой язык согласно заранее составленному словарю.
 */
public class Demo {

    public static void main(String[] args) {
        String baseOfLanguageFrom = "e:\\JavaTemp\\baseFrom.txt";
        String baseOfLanguageTo = "e:\\JavaTemp\\baseTo.txt";

        Dictionary dictionary = new Dictionary(baseOfLanguageFrom, baseOfLanguageTo);

        System.out.println(dictionary.map);

        if (!dictionary.initiated) {
            System.out.println("Error!");
            return;
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Input the word to translate");

        String wordToTranslate = sc.next();

        System.out.println("Translation is " + dictionary.translate(wordToTranslate));
    }
}
