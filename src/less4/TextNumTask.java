import java.util.LinkedList;
import java.util.Scanner;

/**
 * Реализовать консольное приложение, которое:
 * 1. Принимает от пользователя строку вида
 * text~num
 * 2. Нужно рассплитить строку по ~, сохранить text в связный список на
 * позицию num.
 * 3. Если введено print~num, выводит строку из позиции num в связном
 * списке и удаляет её из списка.
 */
public class TextNumTask {

    public void addToLinkedList() {
        LinkedList<String> list = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        while (true) {
            String string = in.next();
            if ("Q".equalsIgnoreCase(string)) {
                in.close();
                System.exit(0);
            }
            String[] split = string.split("~");
            int num = Integer.parseInt(split[1]);
            if (!"print".equalsIgnoreCase(split[0])) {
                if (list.size() < num) {
                    for (int i = list.size(); i < num * 2; i++) {
                        list.add(i, null);
                    }
                }
                list.set(num - 1, split[0]);
                continue;
            }
            if (num < list.size()) {
                System.out.println("Исходный: " + list);
                System.out.println("Получили и удалили: " + list.remove(num - 1));
                System.out.println("Окончательный: " + list);
            }
        }
    }
}
