package home02.epam.task02.array_of_array;

public class Task22 {
    public static void main(String[] args) {
        int n = 6;

        int [][] mas = new int [n][n];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length-i; j++) {
                mas[i][j] = i+j+1;
            }
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print( mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
