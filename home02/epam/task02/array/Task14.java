package home02.epam.task02.array;

public class Task14 {
    public static void main(String[] args) {
        //Дан одномерный массив A[N]. Найти:
        //max(a2,a4,,a2k )+min(a1,a3,,a2k+1)

        int[] array = {2, 3, 4, 7, 9, 11, 1, 3, 5, 6, 8};
        int min;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        int sum = min + max;
        System.out.println("sum = " + sum);
    }

}
