package home02.epam.task02.array_of_array;

import java.util.Random;

public class Task07 {
    public static void main(String[] args) {
        //Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов
        int[][] mas = new int[5][5];
        int sum = 0;
        Random random = new Random();


        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = random.nextInt(25);
                if(random.nextInt(25) % 3 == 0) {
                    mas[i][j] = -mas[i][j];
                }
                System.out.printf("%5d", mas[i][j]);

            }
            System.out.println();
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if(Math.abs(mas[i][j]) % 2 == 1 && mas[i][j] < 0) {
                    sum += mas[i][j];
                }
            }
        }
        System.out.print("sum = " + sum);
    }
}
