package home02.epam.task02.array_of_array;

import java.util.Random;

public class Task28 {
    public static void main(String[] args) {
        //Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
        // Определить, какой столбец содержит максимальную сумму.

        int[][] mas = new int[5][5];

        Random rand = new Random();

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rand.nextInt(1, 50);
                mas[i][j] = -mas[i][j];
                System.out.printf("%6d", mas[i][j]);
            }
            System.out.println();
        }

        int[] sum = new int[mas.length];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                int elem_module = Math.abs(mas[j][i]);
                sum[i] += elem_module;
            }
        }

        int sumMax = 0;
        for (int i = 0; i < sum.length; i++) {
            if (sum[i] > sumMax) {
                sumMax = i;
            }
        }

        for (int i = 0; i < sum.length; i++) {
            System.out.printf("{%4d}", sum[i]);
        }
        System.out.println();
        System.out.println("столбец - " + sumMax + " содержит максимальную сумму");
    }
}
