package home02.epam.task02.array_of_array;

import java.util.Random;

public class Task03 {
    public static void main(String[] args) {
        //Дана матрица. Вывести на экран первый и последний столбцы

        int[][] array = new int[5][5];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(25);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------");
        System.out.println("Первый столбец");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][0] + " ");
        }
        System.out.println("--------------");
        System.out.println("Последний столбец");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][array.length-1] + " ");
        }
    }
}

