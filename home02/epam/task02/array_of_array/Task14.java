package home02.epam.task02.array_of_array;

public class Task14 {
    public static void main(String[] args) {
        //Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

        int n = 8;

        int[][] mas = new int[n][n];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][mas.length - i - 1] = i;
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
