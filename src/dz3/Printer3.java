package dz3;
/*Анализатор списка

Реализуйте метод, который принимает на вход целочисленный массив arr:
- Создаёт список ArrayList, заполненный числами из исходого массива arr.
- Сортирует список по возрастанию и выводит на экран.
- Находит минимальное значение в списке и выводит на экран - Minimum is {число} - Находит максимальное значение
в списке и выводит на экран - Maximum is {число}
- Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает на вход один параметр:

Integer[] arr - массив целых чисел.

Пример.
Исходный массив:
4, 2, 7, 5, 1, 3, 8, 6, 9

Результаты:
[1, 2, 3, 4, 5, 6, 7, 8, 9]
Minimum is 1
Maximum is 9
*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Answer3 {
    public static void analyzeNumbers(Integer[] arr) {
        // Создаем список ArrayList и заполняем его числами из исходного массива
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

        // Сортируем список по возрастанию и выводим на экран
        Collections.sort(list);
        System.out.println(list);

        // Находим минимальное и максимальное значения в списке
        int min = Collections.min(list);
        int max = Collections.max(list);
        System.out.println("Minimum is " + min);
        System.out.println("Maximum is " + max);

        // Находим среднее арифметическое значений списка
        double sum = 0;
        for (int num : list) {
            sum += num;
        }
        double average = sum / list.size();
        System.out.println("Average is = " + average);
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer3 {
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer3.analyzeNumbers(arr);
    }
}

//Решение от ГБ
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.ArrayList;
//
//class Answer {
//    public static void analyzeNumbers(Integer[] arr) {
//        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(arr));
//        Collections.sort(nums); // сортировка списка по возрастанию
//        System.out.println(nums); // вывод списка на экран
//        System.out.println("Minimum is " + nums.get(0)); // нахождение минимального значения в списке и вывод на экран
//        System.out.println("Maximum is " + nums.get(nums.size()-1)); // нахождение максимального значения в списке и вывод на экран
//
//        int sum = 0;
//        for(int i : nums){ // вычисление суммы всех элементов списка
//            sum += i;
//        }
//        System.out.println("Average is = " + (double) sum / nums.size()); // вычисление среднего арифметического значений списка и вывод на экран
//    }
//}
//
//public class Printer{
//    public static void main(String[] args) {
//        Integer[] arr = {};
//
//        if (args.length == 0) {
//            arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
//        }
//        else{
//            arr = Arrays.stream(args[0].split(", "))
//                    .map(Integer::parseInt)
//                    .toArray(Integer[]::new);
//        }
//
//        Answer ans = new Answer();
//        ans.analyzeNumbers(arr);
//    }
//}
