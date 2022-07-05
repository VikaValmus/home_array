package home02.epam.task02.array;

import java.util.Random;

public class Task04 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
//        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        boolean flag = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}
