package home02.epam.task02.array;

public class Task15 {
    public static void main(String[] args) {
        //Дана последовательность действительных чисел a1,a2,,an . Указать те ее элементы, которые принадлежат отрезку [с, d].

        int[] array = {3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        int c = 3;
        int d = 9;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > c && array[i] < d){
                System.out.print(array[i] + " ");
            }
        }
    }
}
