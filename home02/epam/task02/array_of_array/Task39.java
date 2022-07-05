package home02.epam.task02.array_of_array;

import java.util.Random;

public class Task39 {
    public static void main(String[] args) {
        //Найдите произведение двух матриц.

        int[][] mas = new int[4][3];

        int resultMas = 1;

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = j+1;
                resultMas = resultMas * mas[i][j];
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("произведение елементов массива mas = " + resultMas);
        System.out.println("-------");

        int[][] mas2 = new int[3][3];

        int resultMas2 = 1;

        for (int i = 0; i < mas2.length; i++) {
            for (int j = 0; j < mas2[i].length; j++) {
                mas2[i][j] = j+1;
                resultMas2 = resultMas2 * mas2[i][j];
                System.out.print(mas2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("произведение елементов массива mas2 = " + resultMas2);
        System.out.println("-------");

        int result = resultMas*resultMas2;
        System.out.println("произведениe двух матриц = " + result);
    }
}
