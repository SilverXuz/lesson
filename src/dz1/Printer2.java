package dz1;
/*
Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000,
каждое на новой строке.
Напишите свой код в методе printPrimeNums класса Answer.
*/

class Answer2 {
    public void printPrimeNums(){
        // Напишите свое решение ниже
        int min = 1;
        int max = 1000;

        for (int i = min; i < max; ++i) {
            int count = 0;
            if (i < 2)
                continue;
            for (int j = 2; j <= i && count < 2; ++j) {
                if (i % j == 0) {
                    ++count;
                }
            }
            if (count < 2)
                System.out.println(i);
        }

    }

}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer2{
    public static void main(String[] args) {

        Answer2 ans = new Answer2();
        ans.printPrimeNums();
    }
}
