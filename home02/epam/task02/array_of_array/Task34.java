package home02.epam.task02.array_of_array;

public class Task34 {
    public static void main(String[] args) {
        //Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца.

        int[][] mas = new int[10][6];

        arrayInitialization(mas);
        arrayOutput(mas);

    }

    public static void arrayInitialization(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (j > i) {
                    mas[i][j] = 1;
                }
            }
        }
    }

    public static void arrayOutput(int[][] mas) {
        for (int[] ma : mas) {
            for (int i : ma) {
                System.out.printf("%4d", i);
            }
            System.out.println();
        }
    }
}
