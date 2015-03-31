package Lesson02_Variables_Types.Task_01;

/**
 Скорость первого автомобиля 50 км/ч, второго — 30 км/ч, расстояние между ними 80 км.
 Какое расстояние (вывести на экран) будет между ними через t ч, если автомобили движутся в разные стороны?
 Переменные и константа t (любое значение) задаются литералами в коде. Формула: s1=s+(v1+v2)t

 */
public class Main {
    public static void main(String[] args) {

        final int TIME_HOURS = 3;
        int v1 = 50, v2 = 30, s = 80;
        int s1 = s + (v1 + v2) * TIME_HOURS;

        System.out.println(s1);
    }
}
