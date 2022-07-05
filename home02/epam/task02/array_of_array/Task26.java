package home02.epam.task02.array_of_array;

import java.util.Random;
import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        //С клавиатуры вводится двумерный массив чисел размерностью nxm. Выполнить с массивом следующие действия:
        //а) вычислить сумму отрицательных элементов в каждой строке;
        //б) определить максимальный элемент в каждой строке;
        //в) переставить местами максимальный и минимальный элементы матрицы.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину строки > ");
        int m = scanner.nextInt();

        System.out.print("Введите длину столбца >");
        int n = scanner.nextInt();

        Random random = new Random();

        int[][] mas = new int[m][n];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = random.nextInt(50);
                if (random.nextInt(50) % 2 == 0) {
                    mas[i][j] = -mas[i][j];
                }
            }
        }

        int sum;
        for (int i = 0; i < mas.length; i++) {
            sum = 0;
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("%4d", mas[i][j]);
                if (mas[i][j] < 0) {
                    sum = sum + mas[i][j];
                }
            }
            System.out.println(" { " + " sum = " + sum + " } ");
        }
        System.out.println();

        int max;
        for (int i = 0; i < mas.length; i++) {
            max = mas[i][0];
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("%4d", mas[i][j]);
                if (mas[i][j] > max) {
                    max = mas[i][j];
                }
            }
            System.out.println(" { " + " max = " + max + " } ");
        }
        System.out.println();

        int min=0;
        int max1=0;
        int temp;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] < min) {
                    min = mas[i][j];
                }
                if (mas[i][j] > max1){
                    max1 = mas[i][j];
                }
            }
        }
        temp = min;
        min = max1;
        max1 = temp;
        System.out.println(" { " + " min = " + min + " } ");
        System.out.println(" { " + " max1 = " + max1 + " } ");
    }
}
