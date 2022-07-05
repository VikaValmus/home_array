package home02.epam.task02.array;

public class Task02 {
    public static void main(String[] args) {
        //В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.

        int[] arg = {2, 4, 5, 1, 0, 9, 0, 2, 3, 0, 5, 0};
        int count = 0;
        for (int i = 0; i < arg.length; i++) {
            if (arg[i] == 0) {
                count++;
            }
        }
        int[] arrayNumber = new int[count];
        for (int i = 0, j = 0; i < arg.length; i++) {
            if (arg[i] == 0) {
                arrayNumber[j++] = i;
            }
        }
        for (int i = 0; i < arg.length; i++) {
            System.out.print(arg[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arrayNumber.length; i++) {
            System.out.print(arrayNumber[i] + " ");
        }
        System.out.println();
    }

}
