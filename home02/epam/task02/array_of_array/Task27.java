package home02.epam.task02.array_of_array;

import java.util.Random;
import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        //В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
        // на соответствующие им позиции другого,а его элементы второго переместить в первый.
        // Номера столбцов вводит пользователь с клавиатуры.

        int[][] mas = new int[5][6];

        Random rand = new Random();

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rand.nextInt(100);
            }
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("%4d", mas[i][j]);
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("введите номер первого столбца - ");
        int j1 = scanner.nextInt();

        System.out.print("введите номер второго столбца - ");
        int j2 = scanner.nextInt();

        if (j1> mas.length && j2> mas.length){
            System.out.print("Вы введли неверный номер столбца!");

        }

        int[][] array = mas;

        for (int i = 0; i < mas.length; i++) {
            int tmp = array[i][j1];
            array[i][j1] = array[i][j2];
            array[i][j2] = tmp;
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("%4d", mas[i][j]);
            }
            System.out.println();
        }

    }
}
