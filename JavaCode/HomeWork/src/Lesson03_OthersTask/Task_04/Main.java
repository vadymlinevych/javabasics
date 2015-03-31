package Lesson03_OthersTask.Task_04;

import java.io.IOException;
import java.util.Scanner;

/**
 * Написать консольную игру «Крестики нолики» используя двухмерные массивы
 */

public class Main {

    public static char[][] field =
            {{'+', '+', '+'}, {'+', '+', '+'}, {'+', '+', '+'}};


    public static void main(String[] args) throws IOException {
        System.out.println("Game Started!!!");
        printField();
        while (checkGame() == ' ' && canMove()) {
            humanMove();
            compMove();
            printField();
        }
        if (checkGame() == 'X') {
            System.out.println("YOU WIN!");
        }
        if (checkGame() == '0') {
            System.out.println("YOU LOSE!");
        }
        if (checkGame() == ' ' && !canMove()) {
            System.out.println("STANDOFF!");
        }
    }


    public static void printField() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }


    public static void humanMove() throws IOException {
        int x, y;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x (1..3):");
        x = sc.nextInt() - 1;

        System.out.println("Enter y (1..3):");
        y = sc.nextInt() - 1;

        while (field[x][y] == '0' || field[x][y] == 'X' || x < 0 || x > 2
                || y < 0 || y > 2) {

            System.out.println("Enter x:");
            x = sc.nextInt() - 1;

            System.out.println("Enter y:");
            y = sc.nextInt() - 1;
        }
        field[x][y] = 'X';
    }

    public static void compMove() {
        int x = (int) (Math.random() * 3), y = (int) (Math.random() * 3);
        while (field[x][y] == '0' || field[x][y] == 'X') {
            x = (int) (Math.random() * 3);
            y = (int) (Math.random() * 3);
        }
        field[x][y] = '0';
    }

    public static boolean canMove() {
        boolean p = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[i][j] == '+') {
                    p = true;
                    break;
                }
            }
            if (p = true) {
                break;
            }
        }
        return p;
    }

    public static char checkGame() {
        char winner = ' ';
        // по горизонтали
        for (int i = 0; i < 3; i++) {
            if (field[i][0] == field[i][1] && field[i][1] == field[i][2]
                    && field[i][0] != '+') {
                winner = field[i][0];
                break;
            }
        }

        // по вертикали
        if (winner == ' ') {
            for (int i = 0; i < 3; i++) {
                if (field[0][i] == field[1][i] && field[1][i] == field[2][i]
                        && field[0][i] != '+') {
                    winner = field[0][i];
                    break;
                }
            }
        }

        // главная диагональ
        if (winner == ' ') {
            if (field[0][0] == field[1][1] && field[1][1] == field[2][2]
                    && field[0][0] != '+') {
                winner = field[0][0];
            }
        }

        //побочная диагональ
        if (winner == ' ') {
            if (field[0][2] == field[1][1] && field[1][1] == field[2][0]
                    && field[0][2] != '+') {
                winner = field[0][2];
            }
        }
        return winner;
    }

}