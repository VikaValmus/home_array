package home02.epam.task02.array_of_array;

import java.util.Random;

public class Task06 {
    public static void main(String[] args) {
        //Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего

        int[][] mas = new int[4][5];
        Random random = new Random();

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = random.nextInt(30);
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------");
        for (int j = 1; j < mas[0].length; j = j + 2) {
            if (mas[0][j] > mas[mas.length - 1][j]) {
                for (int k = 0; k < mas.length; k++) {
                    System.out.println(mas[k][j]);
                }
                System.out.println();
            }
        }
    }
}