package home02.epam.task02.array;

import java.util.Random;

public class Task19 {
    public static void main(String[] args) {
        //В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
        // Если таких чисел несколько, то определить наименьшее из них.

        int n = 15;

        int [] mas = new int [n];

        Random random = new Random();

        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(10);
            System.out.print(mas[i] + " ");
        }
        System.out.println();

        int number = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if(mas[i]==number){
                number = mas[i];
                System.out.println(number);
            }
        }
//        System.out.println(number);

    }
}
