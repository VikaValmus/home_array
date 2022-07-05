package home02.epam.task02.array_of_array;

public class Task12 {
    public static void main(String[] args) {
        //Получить квадратную матрицу порядка n:

        int [][] mas = new int [6][6];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][i] = i;
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
