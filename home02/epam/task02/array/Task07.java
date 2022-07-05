package home02.epam.task02.array;

public class Task07 {
    public static void main(String[] args) {
        //Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 8};
        int z = 5;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5) {
                array[i] = z;
                count++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("количество замен = " + count);

    }
}
