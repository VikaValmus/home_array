package home02.epam.task02.array;

public class Task11 {
    public static void main(String[] args) {
        //Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых остаток от деления на М равен L (0 < L < М-1).

        int[] array = {3, 4, 5, 6, 7, 8, 9, 10, 13, 16};
        int m = 3;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % m >0 && array[i] % m < (m-1)) {
                System.out.print(array[i] + " ");
            }
        }

    }
}
