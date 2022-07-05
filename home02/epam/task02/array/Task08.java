package home02.epam.task02.array;

public class Task08 {
    public static void main(String[] args) {
        //Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.

        int[] array = {-1, 2, 0, -2, -3, 4, 5, 0, 6, -4, -7, 0, 6, 8,};

        int countNumberNegative = 0;
        int countNumberPositive = 0;
        int countNumberZero = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                countNumberPositive++;
            } else if (array[i] == 0) {
                countNumberZero++;
            } else {
                countNumberNegative++;
            }
        }

        System.out.println("в массиве array отрицательных элементов = " + countNumberNegative);
        System.out.println("в массиве array положительных элементов = " + countNumberPositive);
        System.out.println("в массиве array нулевых элементов = " + countNumberZero);

//        int[] arraysNumberPositive = new int[countNumberPositive];
//        for (int i = 0, j = 0; i < array.length; i++) {
//            if (array[i] > 0) {
//                arraysNumberPositive[j++] = array[i];
//            }
//        }
//
//        for (int i = 0; i < arraysNumberPositive.length; i++) {
//            System.out.print(arraysNumberPositive[i] + " ");
//        }
//        System.out.println();
//        System.out.println("в массиве array положительных элементов = " + arraysNumberPositive.length);
//        System.out.println("в массиве array положительных элементов = " + countNumberPositive);
//
//        int[] arraysNumberNegative = new int[countNumberNegative];
//        for (int i = 0, j = 0; i < array.length; i++) {
//            if (array[i] < 0) {
//                arraysNumberNegative[j++] = array[i];
//            }
//        }
//
//        for (int i = 0; i < arraysNumberNegative.length; i++) {
//            System.out.print(arraysNumberNegative[i] + " ");
//        }
//        System.out.println();
//        System.out.println("в массиве array отрицательных элементов = " + arraysNumberNegative.length);
//        System.out.println("в массиве array отрицательных элементов = " + countNumberNegative);
//
//        int[] arraysNumberZero = new int[countNumberZero];
//        for (int i = 0, j = 0; i < array.length; i++) {
//            if (array[i] == 0) {
//                arraysNumberZero[j++] = array[i];
//            }
//        }
//
//        for (int i = 0; i < arraysNumberZero.length; i++) {
//            System.out.print(arraysNumberZero[i] + " ");
//        }
//        System.out.println();
//        System.out.println("в массиве array нулевых элементов = " + arraysNumberZero.length);
//        System.out.println("в массиве array нулевых элементов = " + countNumberZero);
    }
}
