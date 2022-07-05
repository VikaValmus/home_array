package home02.epam.task02.array_of_array;

import java.util.Random;

public class Task32 {
    public static void main(String[] args) {
        //Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

        int[][] mas = new int[4][7];

        arrayInitialization(mas);
        arrayOutput(mas);

        sortArrayInAscendingOrder(mas);
        sortArrayInAscendingOrderOutput(mas);

        sortArrayInDescendingOrder(mas);
        sortArrayInDescendingOrderOutput(mas);

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

    public static void sortArrayInAscendingOrder(int[][] mas) {
        int b;

        System.out.println("sortArrayInAscendingOrder");

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                for (int k = j + 1; k < mas[i].length; k++) {
                    if (mas[i][j] > mas[i][k]) {
                        b = mas[i][j];
                        mas[i][j] = mas[i][k];
                        mas[i][k] = b;
                    }
                }
            }
        }
    }

    public static void sortArrayInAscendingOrderOutput(int[][] mas) {
        for (int[] ma : mas) {
            for (int i : ma) {
                System.out.printf("%4d", i);
            }
            System.out.println();
        }
    }


    public static void sortArrayInDescendingOrder(int[][] mas) {
        int temp;

        System.out.println("sortArrayInDescendingOrder");

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                for (int k = j + 1; k < mas[i].length; k++) {
                    if (mas[i][j] < mas[i][k]) {
                        temp = mas[i][j];
                        mas[i][j] = mas[i][k];
                        mas[i][k] = temp;
                    }
                }
            }
        }
    }

    public static void sortArrayInDescendingOrderOutput(int[][] mas) {
        for (int[] ma : mas) {
            for (int i : ma) {
                System.out.printf("%4d", i);
            }
            System.out.println();
        }
    }
}
