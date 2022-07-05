package home02.epam.task02.array_of_array;

public class Task13 {
    public static void main(String[] args) {
        //Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
        int n = 6;

        int[][] mas = new int[n][n];

        for (int i = 0; i < mas.length; i = i + 2) {
            for (int j = 0; j < mas[i].length; j++) {
//                mas[i][j] = j + 1;
                mas[i + 1][j] = mas[i].length - j;
            }
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
