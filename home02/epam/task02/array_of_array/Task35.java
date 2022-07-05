package home02.epam.task02.array_of_array;

import java.util.Random;

public class Task35 {
    public static void main(String[] args) {
        //Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
        int[][] mas = new int[5][4];

        arrayInitialization(mas);
        arrayOutput(mas);
        replacingAnArrayElementWithAMax(mas, arrayMaxElement(mas));
        replacingAnArrayElementWithAMaxOutput(mas);
    }

    public static void arrayInitialization(int[][] mas) {
        Random random = new Random();

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = random.nextInt(30);
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

    public static int arrayMaxElement(int[][] mas) {
        int maxElement = 0;

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] > maxElement) {
                    maxElement = mas[i][j];
                }
            }
        }
        System.out.println(maxElement);
        return maxElement;
    }

    public static void replacingAnArrayElementWithAMax(int[][] mas, int maxElement) {

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] % 2 == 1) {
                    mas[i][j] = maxElement;
                }
            }
        }
    }

    public static void replacingAnArrayElementWithAMaxOutput(int[][] mas) {
        for (int[] ma : mas) {
            for (int i : ma) {
                System.out.printf("%4d", i);
            }
            System.out.println();
        }
    }
}
