/**
 * Напишите метод, который принимает на вход строку (String) и определяет является
 * ли строка палиндромом (возвращает boolean значение).
 */
public class ThirdTask {

    public static boolean reverseString(String myString) {
        String source = myString.replaceAll(" ", "");
        StringBuilder result = new StringBuilder(source);
        String reversed = result.reverse().toString();
        return source.equalsIgnoreCase(reversed);
    }
}
