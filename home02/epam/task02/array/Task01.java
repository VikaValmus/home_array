package home02.epam.task02.array;

import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
        //В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
        int n = 15;
        int k = 3;
        int sum = 0;

        int[] ar = new int[n];
        Random random = new Random();

        for (int i = 0; i < ar.length; i++) {
            ar[i] = random.nextInt(10);
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
            if (ar[i] % k == 0) {
                sum += ar[i];
            }
        }
        System.out.println();
        System.out.print("сумма элементов, которые кратны k = " + sum);

    }
}
