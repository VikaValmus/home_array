package home02.epam.task02.array_of_array;

public class Task21 {
    public static void main(String[] args) {
        int n = 4;

        int[][] mas = new int[n][n];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length - i; j++) {
                mas[mas.length - i - 1][j] = i + j + 1;
            }
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
