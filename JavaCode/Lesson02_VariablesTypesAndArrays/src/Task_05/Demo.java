package Task_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 5. Упражнение «Калькулятор Четырех Операций»
    a) Прочитать с консоли число 1
    b) Прочитать с консоли число 2
    c) Вывести сумму, разность, произведение и частное введенных чисел.
 */
public class Demo {
    public static void main(String[] arg)  throws IOException {

        BufferedReader d = new BufferedReader(new InputStreamReader(System.in));

        String n1_str = d.readLine();
        String n2_str = d.readLine();

        float n1 = Float.parseFloat(n1_str);
        float n2 = Float.parseFloat(n2_str);

        float summ, diff, multiple;
        double divided;

        summ = n1 + n2;
        diff = n1 - n2;
        multiple = n1 * n2;
        divided = n1 / n2;

        System.out.println(summ);
        System.out.println(diff);
        System.out.println(multiple);
        System.out.println(divided);
    }


}
