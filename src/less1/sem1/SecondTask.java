package less1.sem1;

import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.Scanner;

/**
 * В консоли запросить имя пользователя. В зависимости от
 * текущего времени, вывести приветствие вида
 * "Доброе утро, <Имя>!", если время от 05:00 до 11:59
 * "Добрый день, <Имя>!", если время от 12:00 до 17:59;
 * "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
 * "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
 */
public class SecondTask {

    private String name;

    public SecondTask() {
        System.out.println("Здравствуйте! Введите Ваше имя");
        Scanner input = new Scanner(System.in, StandardCharsets.UTF_8);
        name = input.next();
        input.close();
    }

    private String getGreetingString() {
        Calendar calendar = Calendar.getInstance();
        int currentHour = calendar.get(Calendar.HOUR_OF_DAY);
        if (currentHour >= 5 && currentHour < 12) {
            return "Доброе утро, ";
        }
        if (currentHour >= 12 && currentHour < 18) {
            return "Добрый день, ";
        }
        if (currentHour >= 18 && currentHour < 23) {
            return "Добрый вечер, ";
        }
        return "Доброй ночи, ";
    }

    public void sayGreeting() {
        String greetingString = getGreetingString();
        System.out.println(greetingString + name + "!");
    }
}
