import java.util.*;

public class Main {
    public static void main(String[] args) {
//        FirstTask firstTask = new FirstTask();
//        Scanner in = new Scanner(System.in);
//
//        while (true) {
//            String input = in.next();
//            if ("Q".equalsIgnoreCase(input)) {
//                System.exit(0);
//            }
//            System.out.println(firstTask.getByName(input));
//        }

//        ThirdTask.sortedMap("Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись");
        FourthTask fourthTask = new FourthTask();
        fourthTask.isCorrect("a+(d*3)");
        fourthTask.isCorrect("[a+(1*3)");
        fourthTask.isCorrect("[6+(3*3)]");
        fourthTask.isCorrect("{a}[+]{(d*3)}");
        fourthTask.isCorrect("<{a}+{(d*3)}>");
        fourthTask.isCorrect("{a+]}{(d*3)}");
    }

}