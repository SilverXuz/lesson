import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
 * который запишет эту строку в
 * простой текстовый файл, обработайте исключения.
 */
public class FourthTask {

    private static final Logger LOGGER = Logger.getLogger("FourthTask");

    public String stringGenerator() {
        LOGGER.info("Генерация строки");
        StringBuilder testString = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            testString.append("TEST ");
        }
        LOGGER.info("Генерация строки окончена");
        return testString.toString();
    }

    public void writer() {
        try {
            FileWriter fileWriter = new FileWriter("test.txt");
            fileWriter.write(stringGenerator());
            fileWriter.close();
        } catch (IOException e) {
            LOGGER.severe("Ошибка при генерации файла: " + e.getMessage());
        }
    }
}
