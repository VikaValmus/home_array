package home02.epam.task02.array_of_array;

import java.util.Random;

public class Task11 {
    public static void main(String[] args) {
        //Дана матрица размера m x n. Вывести ее элементы в следующем порядке:
        //первая строка справа налево, вторая строка слева направо, третья строка справа налево и так далее.

        int m = 6;
        int n = 7;

        int[][] mas = new int[m][n];
        Random rand = new Random();

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rand.nextInt(1000);
                if (rand.nextInt(1000) % 3 == 0) {
                    mas[i][j] = -mas[i][j];
                }
                System.out.printf("[%4d]", mas[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("[%4d]", mas[i][j]);
            }
            System.out.println();
            i++;
            if (i >= mas.length) {
                break;
            }
            for (int j = mas[i].length - 1; j >= 0; j--) {
                System.out.printf("[%4d]", mas[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}

