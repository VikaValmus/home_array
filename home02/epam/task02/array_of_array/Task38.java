package home02.epam.task02.array_of_array;

import java.util.Random;

public class Task38 {
    public static void main(String[] args) {
        // Найдите сумму двух матриц

        int[][] mas = new int[3][3];
        Random rand = new Random();

        int sumMas = 0;

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rand.nextInt(10);
                sumMas = sumMas + mas[i][j];
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Сумма елементов массива mas = " + sumMas);
        System.out.println("-------");

        int[][] mas2 = new int[4][4];
        int sumMas2 = 0;

        for (int i = 0; i < mas2.length; i++) {
            for (int j = 0; j < mas2[i].length; j++) {
                mas2[i][j] = rand.nextInt(20);
                sumMas2 = sumMas2 + mas2[i][j];
                System.out.printf("%2d ", mas2[i][j]);
            }
            System.out.println();
        }
        System.out.println("Сумма елементов массива mas2 = " + sumMas2);
        System.out.println("-------");

        int resultSum = sumMas + sumMas2;
        System.out.println("Сумма двух матриц = " + resultSum);

    }
}
