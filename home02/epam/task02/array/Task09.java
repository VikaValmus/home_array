package home02.epam.task02.array;

public class Task09 {
    public static void main(String[] args) {
        //Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

        int[] array = {2, 4, 8, 1, 7, 5, 9};
        int min;
        int minN;
        minN = 0;
        min = array[0];
        for (int i = 0; i < array.length; i++)//ищем минимальный элемент
        {
            if (array[i] < min) {
                min = array[i];
                minN = i;//запоминаем номер элемента
            }
        }
        int max;
        int maxN;
        maxN = 0;
        max = array[0];
        for (int i = 0; i < array.length; i++)//ищем максимальный элемент
        {
            if (array[i] > max) {
                max = array[i];
                maxN = i;//запоминаем номер элемента
            }
        }
        int revers;
        revers = array[maxN];
        array[maxN] = array[minN];
        array[minN] = revers;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
