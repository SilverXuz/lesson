package dz3;
/*Удаление четных элементов

Дан произвольный массив целых чисел. Создайте список ArrayList, заполненный данными из этого массива.
Необходимо удалить из списка четные числа и вернуть результирующий.

Напишите свой код в методе removeEvenNumbers класса Answer.
Метод removeEvenNumbers принимает на вход один параметр:
Integer[] arr - список целых чисел, возвращает список ArrayList<Integer>

Примеры.
Исходный массив:
1, 2, 3, 4, 5, 6, 7, 8, 9

Результат:
[1, 3, 5, 7, 9]

Исходный массив:
2, 4, 6, 8

Результат:
[]
*/


import java.util.ArrayList;
import java.util.Arrays;

class Answer {
    public static ArrayList<Integer> removeEvenNumbers(Integer[] arr) {
        ArrayList<Integer> resultList = new ArrayList<>();

        // Проходимся по всем элементам массива
        for (Integer num : arr) {
            // Если число нечетное, добавляем его в результирующий список
            if (num % 2 != 0) {
                resultList.add(num);
            }
        }

        return resultList;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer2 {
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        ArrayList<Integer> result = Answer.removeEvenNumbers(arr);
        System.out.println(result);
    }
}


//Решение ГБ
//import java.util.Arrays;
//import java.util.ArrayList;
//
//class Answer {
//    public static ArrayList<Integer> removeEvenNumbers(Integer[] arr) {
//        // Введите свое решение ниже
//        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(arr));
//        for (int i = 0; i < nums.size(); i++) {
//            if (nums.get(i) % 2 == 0) {
//                nums.remove(i);
//                i--;
//            }
//        }
//        return nums;
//    }
//}
//
//// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
//public class Printer{
//    public static void main(String[] args) {
//        Integer[] arr = {};
//
//        if (args.length == 0) {
//            // При отправке кода на Выполнение, вы можете варьировать эти параметры
//            arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
//        }
//        else{
//            arr = Arrays.stream(args[0].split(", "))
//                    .map(Integer::parseInt)
//                    .toArray(Integer[]::new);
//        }
//
//        Answer ans = new Answer();
//        ArrayList<Integer> nums = ans.removeEvenNumbers(arr);
//        System.out.println(nums);
//    }
//}
