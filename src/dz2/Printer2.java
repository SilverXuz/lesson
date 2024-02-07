package dz2;
/*Сортировка пузырьком с логированием

Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

Напишите свой код в методе sort класса BubbleSort. Метод sort принимает на вход один параметр:
int[] arr - числовой массив

После каждого прохода по массиву ваш код должен делать запись в лог-файл 'log.txt'
в формате год-месяц-день час:минуты {массив на данной итерации}.
Для логирования использовать логгер logger класса BubbleSort.

Пример:
arr = new int[]{9, 4, 8, 3, 1};
sort(arr)

// При чтении лог-файла получим:
2023-05-19 07:53 [4, 8, 3, 1, 9]
2023-05-19 07:53 [4, 3, 1, 8, 9]
2023-05-19 07:53 [3, 1, 4, 8, 9]
2023-05-19 07:53 [1, 3, 4, 8, 9]
2023-05-19 07:53 [1, 3, 4, 8, 9]
*/


import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

class BubbleSort {
    private static Logger logger = Logger.getLogger(BubbleSort.class.getName());
    private static FileWriter fileWriter;

    static {
        try {
            fileWriter = new FileWriter("log.txt", true);
        } catch (IOException e) {
            logger.severe("Ошибка при создании FileWriter: " + e.getMessage());
        }
    }

    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Меняем местами элементы, если они стоят в неправильном порядке
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            // Записываем результат сортировки в лог после каждой итерации
            writeLog(arr);
        }
        closeFileWriter(); // Закрываем FileWriter после окончания сортировки
    }

    private static void writeLog(int[] arr) {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            Date date = new Date();
            String formattedDate = formatter.format(date);
            String arrayString = Arrays.toString(arr);
            String logLine = formattedDate + " " + arrayString + "\n";
            fileWriter.write(logLine);
            System.out.print(logLine); // Выводим логи также на консоль
        } catch (IOException e) {
            logger.severe("Ошибка при записи в лог: " + e.getMessage());
        }
    }

    private static void closeFileWriter() {
        try {
            fileWriter.close();
        } catch (IOException e) {
            logger.severe("Ошибка при закрытии FileWriter: " + e.getMessage());
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer2 {
    public static void main(String[] args) {
        int[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new int[]{9, 4, 8, 3, 1};
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        BubbleSort.sort(arr);
    }
}


