import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 1. Напишите метод, который заполнит массив из 1000 элементов случайными
 * цифрами от 0 до 24.
 * 2. Создайте метод, в который передайте заполненный выше массив и с
 * помощью Set вычислите процент уникальных значений в данном массиве и
 * верните его в виде числа с плавающей запятой.
 * Для вычисления процента используйте формулу:
 * процент уникальных чисел = количество уникальных чисел * 100 / общее
 * количество чисел в массиве.
 */
public class SecondTask {

    private static int[] array;

    public static int[] getFilledArray() {
        array = new int[1000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(25);
        }
        return array;
    }

    public static void getUnique(int[] filledArray) {
        Set<Integer> set = new HashSet<>();
        for (int element : filledArray) {
            set.add(element);
        }
//        another way of set init
//        Set<Integer> set = Arrays.stream(filledArray).boxed().collect(Collectors.toSet());
        float result = (float) set.size() * 100 / filledArray.length;
        System.out.println(result);
    }
}
