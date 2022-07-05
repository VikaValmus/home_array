package home02.epam.task02.array;

public class Task13 {
    public static void main(String[] args) {
        //Определить количество элементов последовательности натуральных чисел, кратных числу М и заключенных в промежутке от L до N.

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7};

        int m = 3;
        int l = 3;
        int n = 9;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % m == 0 && array[i] > l && array[i] < n) {
//                System.out.print(array[i] +" ");
                count++;
            }
        }
        System.out.println("количество элементов кратных числу m и заключенных в промежутке от l до n = " + count);

    }
}
