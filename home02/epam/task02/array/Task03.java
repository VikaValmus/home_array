package home02.epam.task02.array;

public class Task03 {
    public static void main(String[] args) {
        //Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число встречается раньше - положительное или отрицательное
        int[] arrayNumber = {1, -2, 4, 5, 0, -4, 3, 4, 9};

        if (arrayNumber[0] >= 0) {
            System.out.println("положительное число встречается раньше");
        } else {
            System.out.println("отрицательное число встречается раньше");
        }

    }

}
