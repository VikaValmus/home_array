package home02.epam.task02.array;

public class Task10 {
    public static void main(String[] args) {
        //Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

        int[] array = {1, 12, 2, 3, 25, 132, 1, 33, 4, 5};

        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
