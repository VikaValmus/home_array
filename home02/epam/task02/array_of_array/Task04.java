package home02.epam.task02.array_of_array;

import java.util.Random;

public class Task04 {
    public static void main(String[] args) {
        //Дана матрица. Вывести на экран первую и последнюю строки

        int[][] array = new int[3][5];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(15);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-------------");
        System.out.println("первая строка");

        for (int elements : array[0]) {
            System.out.print(elements + " ");
        }

        System.out.println();
        System.out.println("-------------");
        System.out.println("последняя строка");


        for (int elements : array[array.length - 1]) {
            System.out.print(elements + " ");
        }
    }
}
