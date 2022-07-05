package home02.epam.task02.array_of_array;

public class Task01 {
    public static void main(String[] args) {
        //Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке была ровно одна единица, и вывести на экран.

        int [][] array = new int [3][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][i] = 1;
                System.out.print(array[i][j] +" ");
            }
            System.out.println();
        }
    }
}
