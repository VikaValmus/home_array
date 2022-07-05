package home02.epam.task02.array_of_array;

public class Task31 {
    public static void main(String[] args) {
        //Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. Посчитать количество двузначных чисел в ней.

        int[][] mas = new int[100][10];

        arrayInitialization(mas);

        arrayOutput(mas);

        int count = countNumber(mas);

        System.out.println("количество двузначных чисел  в массиве = " + count);
    }

    public static void arrayInitialization(int [][] mas) {
        int index = 0;

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 10; j++) {
                mas[i][j] = index;
                index++;
            }
        }
    }

    public static void arrayOutput(int [][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("%4d", mas[i][j]);
            }
            System.out.println();
        }
    }

    public static int countNumber(int [][] mas) {
        int count = 0;

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] > 9 && mas[i][j] < 100){
                    count++;
                }
            }
        }
        return count;
    }
}

