package home02.epam.task02.array_of_array;

public class Task25 {
    public static void main(String[] args) {
        int n = 6;

        int[][] mas = new int[n][n];
        int a = 1;

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = a;
                a++;
            }
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf( "%4d",mas[i][j]);
            }
            System.out.println();
        }
    }
}
