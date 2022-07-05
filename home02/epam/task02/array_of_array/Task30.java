package home02.epam.task02.array_of_array;

import java.util.Random;

public class Task30 {
    public static void main(String[] args) {
        //Матрицу 10x20 заполнить случайными числами от 0 до 15.
        //Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.

        int[][] mas = new int[10][20];
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = random.nextInt(15);
            }
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("%4d", mas[i][j]);
            }
            System.out.println();
        }

        int count;
        for (int i = 0; i < mas.length; i++) {
            count = 0;
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] == 5) {
                    count++;
                }
            }
            if (count >=3){
                System.out.println("Число 5 встречается три и более раз, в " + i + " строке!");
            }
        }
    }
}
