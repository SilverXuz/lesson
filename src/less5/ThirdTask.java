import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Взять набор строк, например,Мороз и солнце день чудесный Еще ты дремлешь друг прелестный
 * Пора красавица проснись.
 * Написать метод, который отсортирует эти строки по длине с помощью TreeMap.
 * Строки с одинаковой длиной не должны “потеряться”.
 */
public class ThirdTask {

    public static void sortedMap(String input) {
        Map<Integer, List<String>> sorted = new TreeMap<>();
        String[] split = input.split(" ");
        for (String s : split) {
            if (sorted.containsKey(s.length())) {
                List<String> strings = sorted.get(s.length());
                strings.add(s);
                continue;
            }
            List<String> strings = new ArrayList<>();
            strings.add(s);
            sorted.put(s.length(), strings);
        }
        System.out.println(sorted);
    }

}
