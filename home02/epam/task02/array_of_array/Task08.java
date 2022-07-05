package home02.epam.task02.array_of_array;

public class Task08 {
    public static void main(String[] args) {
        //Дан двухмерный массив n×m элементов. Определить, сколько раз встречается число 7 среди элементов массива.
        int n = 7;
        int m = 10;
        int number = 7;
        int count = 0;

        int[][] array = new int[n][m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i+1;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == number) {
                    count++;
                }
            }
        }
        System.out.println("число 7 встречается " + count + " раз.");
    }
}
