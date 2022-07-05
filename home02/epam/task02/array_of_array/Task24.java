package home02.epam.task02.array_of_array;

public class Task24 {
    public static void main(String[] args) {
        int n =6;

        int [][] mas = new int [n][n];

        for (int j = 0; j < mas.length; j++) {
            mas[0][j] = j+1;
        }

        for (int i = 1; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                mas[i][j] =(int) Math.pow(mas[0][j],(i+1));
            }
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                System.out.printf("%6d",mas[i][j]);
            }
            System.out.println();
        }
    }
}
