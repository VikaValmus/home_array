package home02.epam.task02.array_of_array;

public class Task16 {
    public static void main(String[] args) {
        //Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

        int n = 8;

        String[][] mas = new String[n][n];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = " 0 ";
                mas[i][i] = (i + 1) + "*" + (i + 2);
                System.out.print( mas[i][j] + "  ");
            }
            System.out.println();

        }
    }
}
