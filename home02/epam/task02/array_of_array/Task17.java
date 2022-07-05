package home02.epam.task02.array_of_array;

public class Task17 {
    public static void main(String[] args) {
        //Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

        int n = 5;

        int[][] mas = new int[n][n];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][mas.length - 1] = 1;
                mas[mas.length - 1][i] = 1;
                mas[0][j] = 1;
                mas[i][0] = 1;
                System.out.print(mas[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
