import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Написать программу, определяющую правильность расстановки скобок в выражении.
 * Пример 1: a+(d*3) - истина
 * Пример 2: [a+(1*3) - ложь
 * Пример 3: [6+(3*3)] - истина
 * Пример 4: {a}[+]{(d*3)} - истина
 * Пример 5: <{a}+{(d*3)}> - истина
 * Пример 6: {a+]}{(d*3)} - ложь
 */
public class FourthTask {
    Map<Character, Character> brackets = new HashMap<>();

    public FourthTask() {
        brackets.put('}', '{');
        brackets.put(')', '(');
        brackets.put(']', '[');
        brackets.put('>', '<');
    }

    public boolean isCorrect(String input) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = input.toCharArray();
        for (char element : charArray) {
            if (brackets.containsValue(element)) {
                stack.push(element);
            } else if (brackets.containsKey(element)) {
                if (stack.isEmpty() || stack.pop() != brackets.get(element)) {
                    System.out.println(false);
                    return false;
                }
            }
        }
        boolean empty = stack.isEmpty();
        System.out.println(empty);
        return empty;
    }
}
