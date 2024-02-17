import java.util.*;

/**
 * Создать структуру для хранения Номеров паспортов и Фамилий
 * сотрудников организации.
 * 123456 Иванов
 * 321456 Васильев
 * 234561 Петрова
 * 234432 Иванов
 * 654321 Петрова
 * 345678 Иванов
 * Вывести данные по сотрудникам с фамилией Иванов
 */
public class FirstTask {

    Map<Integer, String> passportData;

    public FirstTask() {
        passportData = new HashMap<>();
        passportData.put(123456, "Иванов");
        passportData.put(321456, "Васильев");
        passportData.put(234561, "Петрова");
        passportData.put(234432, "Иванов");
        passportData.put(654321, "Петрова");
        passportData.put(345678, "Иванов");
    }

    public List<Integer> getByName(String name) {
        List<Integer> passportNumbers = new ArrayList<>();
        Set<Map.Entry<Integer, String>> entries = passportData.entrySet();

        if (!passportData.containsValue(name)) {
            return new ArrayList<>();
        }

        for (Map.Entry<Integer, String> entry : entries) {
            if (name.equalsIgnoreCase(entry.getValue())) {
                passportNumbers.add(entry.getKey());
            }
        }
        return passportNumbers;
    }
}
