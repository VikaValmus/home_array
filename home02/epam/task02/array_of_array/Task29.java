package home02.epam.task02.array_of_array;

import java.util.Random;

public class Task29 {
    public static void main(String[] args) {
        //29. Найти положительные элементы главной диагонали квадратной матрицы.

        int[][] mas = new int[6][6];

        Random rand = new Random();

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rand.nextInt(1, 50);
                if (mas[i][j] % 2 == 0) {
                    mas[i][j] = -mas[i][j];
                }
            }
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("%4d", mas[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        int cout = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i][i] >= 0) {
                cout++;
            }
        }

        int[] positiveElement = new int[cout];
        int element = 0;
        for (int i = 0, j=0; i < mas.length; i++){
                if (mas[i][i] >= 0) {
                    element = mas[i][i];
                    positiveElement[j++] = element;
                }
            }

        for (int i = 0; i < positiveElement.length; i++) {
            System.out.printf("%4d", positiveElement[i]);
        }
    }

}
