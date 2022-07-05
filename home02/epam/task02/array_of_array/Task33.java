package home02.epam.task02.array_of_array;

import java.util.Random;

public class Task33 {
    public static void main(String[] args) {
        //Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

        int[][] mas = new int[6][4];

        arrayInitialization(mas);
        arrayOutput(mas);

        sortColumnAscending(mas);
        sortColumnAscendingOutput(mas);

        sortColumnDescending(mas);
        sortColumnDescendingOutput(mas);
    }

    public static void arrayInitialization(int[][] mas) {
        Random random = new Random();

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = random.nextInt(50);
            }
        }
    }

    public static void arrayOutput(int[][] mas) {
        for (int[] ma : mas) {
            for (int i : ma) {
                System.out.printf("%4d", i);
            }
            System.out.println();
        }
    }

    public static void sortColumnAscending(int[][] mas) {
        System.out.println("sortColumnAscending");

        int temp;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                for (int k = i + 1; k < mas.length; k++) {
                    if (mas[i][j] > mas[k][j]) {
                        temp = mas[k][j];
                        mas[k][j] = mas[i][j];
                        mas[i][j] = temp;
                    }
                }
            }
        }
    }

    public static void sortColumnAscendingOutput(int[][] mas) {
        for (int[] ma : mas) {
            for (int i : ma) {
                System.out.printf("%4d", i);
            }
            System.out.println();
        }
    }

    public static void sortColumnDescending(int[][] mas) {
        System.out.println("sortColumnDescending");

        int temp;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                for (int k = i + 1; k < mas.length; k++) {
                    if (mas[i][j] < mas[k][j]) {
                        temp = mas[k][j];
                        mas[k][j] = mas[i][j];
                        mas[i][j] = temp;
                    }
                }
            }
        }
    }

    public static void sortColumnDescendingOutput(int[][] mas) {
        for (int[] ma : mas) {
            for (int i : ma) {
                System.out.printf("%4d", i);
            }
            System.out.println();
        }
    }

}
