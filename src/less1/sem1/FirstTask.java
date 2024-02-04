package less1.sem1;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Написать программу, которая запросит пользователя ввести
 * <Имя> в консоли.
 * Получит введенную строку и выведет в консоль сообщение
 * “Привет, <Имя>!”
 */
public class FirstTask {

    private String name;

    //FirstTask myObject = new FirstTask();
    public FirstTask() {
        System.out.println("Здравствуйте! Введите Ваше имя");
        Scanner input = new Scanner(System.in, StandardCharsets.UTF_8);
        name = input.next();
        input.close();
    }

    public void greeting() {
        System.out.println("Привет, " + name);
    }

}
