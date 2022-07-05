package home02.epam.task02.array_of_array;

import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        //Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

        int[][] mas = new int[4][5];
        Random random = new Random();

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = random.nextInt(60);
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }

        int k = 3;
        int p = 4;

        System.out.println("Выведем k-ю строку");
        for (int i = k; i <= k; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Выведем p-й столбец");
        for (int i = 0; i < mas.length; i++) {
            for (int j = p; j <= p; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
