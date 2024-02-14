import java.util.Scanner;

/**
 * Напишите метод, который сжимает строку.
 * Пример: вход aaaabbbcdd, выход: abcd
 */
public class SecondTask {

    private String myInputString;

    public SecondTask() {
        Scanner in = new Scanner(System.in);
        myInputString = in.next();
        in.close();
    }

    public void getUniqSequence() {
        StringBuilder result = new StringBuilder();
        boolean isRepeated;
        char[] charArray = myInputString.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            isRepeated = false;
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated) {
                result.append(charArray[i]);
            }
        }
        System.out.println(result);
    }
}
