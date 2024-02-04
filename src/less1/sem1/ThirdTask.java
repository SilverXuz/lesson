package less1.sem1;

import java.util.Scanner;

/**
 * Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
 * максимальное количество подряд идущих 1.
 */
public class ThirdTask {

    private int size;

    private int[] array;

    private int valueToFind;

    public ThirdTask() {
        System.out.println("Введите размер массива");
        Scanner input = new Scanner(System.in);
        size = input.nextInt();
        System.out.println("Введите элементы массива в количестве " + size + " штук");
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("Введите величину для поиска");
        valueToFind = input.nextInt();
    }

    public void finder() {
        int actualCounter = 0;
        int tmp = 0;

        for (int i = 0; i < size; i++) {
            if (array[i] != valueToFind) {
                tmp = Math.max(actualCounter, tmp);
                actualCounter = 0;
            }
            actualCounter++;
        }

        System.out.println("Максимальное число подряд идущих: " + Math.max(tmp, actualCounter));
    }
}
