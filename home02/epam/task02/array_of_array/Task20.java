package home02.epam.task02.array_of_array;

public class Task20 {
    public static void main(String[] args) {
        int n = 8;

        int[][] mas = new int[n][n];

        for (int j = 0; j < mas.length; j++) {
            for (int i = j; i < mas.length - j; i++) {
                mas[i][j] = 1;
            }
        }
        for (int j = mas.length - 1; j >= 0; j--) {
            for (int i = j; i >= mas.length - j - 1; i--) {
                mas[i][j] = 1;
            }
        }

        for (int[] ma : mas) {
            for (int element : ma) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
