package home02.epam.task02.array;

import java.util.Arrays;

public class Task18 {
    public static void main(String[] args) {
        // «Суперзамок». Секретный замок для сейфа состоит из 10 расположенных в рад ячеек, в которые надо вставить игральные кубики.
        // Но дверь открывается только в том случае, когда в любых трех соседних ячейках сумма точек на передних гранях кубиков равна 10.
        // (Игральный кубик имеет на каждой грани от 1 до 6 точек).
        // Напишите программу, которая разгадывает код замка при условии, что два кубика уже вставлены в ячейки.


        int[] arr = {1, 2, 3};
        int count = fuctorial(arr.length);
        int max = arr.length - 1;
        System.out.println("Вариантов " + count);
        int shift = max;
        while (count > 0) {
            int t = arr[shift];
            arr[shift] = arr[shift - 1];
            arr[shift - 1] = t;
            print(arr);
            count--;
            if (shift < 2) {
                shift = max;
            } else {
                shift--;
            }
        }
    }

    static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    static int fuctorial(int n) {
        return (n > 0) ? n * fuctorial(n - 1) : 1;
    }
}

//        int[] array = new int[10];
//
//        array[0] = 3;
//        array[1] = 4;
//
//        System.out.print(array[0] + " " + array[1] + " ");
//
//        Random random = new Random();
//
//        for (int i = 2; i < array.length; i++) {
//            array[i] = random.nextInt(1, 6);
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//
//        for (int i = 2; i < array.length; i++) {
//            if (array[0] + array[1] + array[i] == 10) {
//                System.out.println("ячейка 0,1," + i + "- Замок открыт");
//                break;
//            } else {
//                System.out.println("ячейка 0,1," + i + "- продолжаем дальше");
//            }
//        }

