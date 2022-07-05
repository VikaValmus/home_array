package home02.epam.task02.array_of_array;

public class Task19 {
    public static void main(String[] args) {
        int n = 6;

        int[][] mas = new int[n][n];

        for (int i = 0; i < mas.length; i++) {
            for (int j = i; j < mas.length - i; j++) {
                mas[i][j] = 1;
            }
        }

        for (int i = mas.length - 1; i >= 0; i--) {
            for (int j = i; j >= mas.length - i - 1; j--) {
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
