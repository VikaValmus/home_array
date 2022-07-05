package home02.epam.task02.array_of_array;

import java.util.Random;

public class Task09 {
    public static void main(String[] args) {
        //Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали

        int[][] mas = new int[5][5];
        Random random = new Random();

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = random.nextInt(100);
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i][i] + " ");
            System.out.print(" " + mas[i][mas.length - i - 1]);
            System.out.println();
        }
    }
}
