import java.util.Scanner;
import java.util.Stack;

/**
 * Реализовать консольное приложение, которое:
 * 1. Принимает от пользователя и “запоминает” строки.
 * 2. Если введено print, выводит строки так, чтобы последняя введенная
 * была первой в списке, а первая - последней.
 * 3. Если введено revert, удаляет предыдущую введенную строку из памяти
 */
public class PrinterNReminder {

    public void solvation() {
        Scanner in = new Scanner(System.in);
        Stack<String> stack = new Stack<>();

        while (true) {
            String input = in.next();
            if ("Q".equalsIgnoreCase(input)) {
                System.exit(0);
            }

            if ("print".equalsIgnoreCase(input)) {
                System.out.println("Print");
                for (int i = stack.size() - 1; i >= 0; i--) {
                    System.out.println(stack.elementAt(i));
                }
                continue;
            }

            if ("revert".equalsIgnoreCase(input)) {
                System.out.println("Revert");
                System.out.println(stack.pop());
                System.out.println(stack);
                continue;
            }
            stack.push(input);
        }
    }
}
