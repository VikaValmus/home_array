package home02.epam.task02.array;

public class Task05 {
    public static void main(String[] args) {
        //Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных чисел этой последовательности.
        //Если таких чисел нет, то вывести сообщение об этом факте.
        int[] arraysNumber = {1, -2, 3, -2, -4, 5, -6, 7, 5, 6};
        int countNumber = 0;
        for (int i = 0; i < arraysNumber.length; i++) {
            if (arraysNumber[i] % 2 == 0) {
                countNumber++;
            }
        }
        int[] arraysNumber2 = new int[countNumber];
        for (int i = 0, j = 0; i < arraysNumber.length; i++) {
            if (arraysNumber[i] % 2 == 0) {
                arraysNumber2[j++] = arraysNumber[i];
            }
        }
        for (int i = 0; i < arraysNumber2.length; i++) {
            System.out.print(arraysNumber2[i] + " ");
        }
    }
}
