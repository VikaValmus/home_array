package home02.epam.task02.array;

public class Task17 {
    public static void main(String[] args) {
        //Дана последовательность целых чисел a1,a2,,an . Образовать новую последовательность, выбросив из исходной те члены, которые равны min(a1,a2,,an).

        int[] array = {23, 34, 15, 6, 67, 8, 9, 10, 11, 12, 13, 14, 15};
        int min = array[0];
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != min) {
                System.out.print(array[i] + " ");
            }
        }
    }
}