package home02.epam.task02.array_of_array;

import java.util.Random;

public class Task05 {
    public static void main(String[] args) {
        //Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.

        int[][] mas = new int[7][4];
        Random random = new Random();

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = random.nextInt(20);
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------");
        for (int i = 0; i < mas.length; i = i + 2) {
           System.out.print(i + " - ");
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
