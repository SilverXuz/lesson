package dz4;

/*
* Калькулятор с отменой последней операции

В обычный калькулятор без логирования добавьте возможность отменить последнюю операцию.

Отмена последней операции должна быть реализована следующим образом: если передан оператор '<' калькулятор должен
вывести результат предпоследней операции.


calculate('+', 3, 7)
calculate('+', 4, 7)
calculate('<', 0, 0)

// 10.0
// 11.0
// 10.0

calculate('*', 3, 2)
calculate('-', 7, 4)
calculate('<', 0, 0)

// 6.0
// 3.0
// 6.0
*/

import java.util.ArrayDeque;
import java.util.Deque;

class Calculator {
    private Deque<Integer> stack = new ArrayDeque<>();

    public int calculate(char op, int a, int b) {
        switch (op) {
            case '+':
                stack.push(a + b);
                break;
            case '-':
                stack.push(a - b);
                break;
            case '*':
                stack.push(a * b);
                break;
            case '/':
                stack.push(a / b);
                break;
            case '<':
                if (stack.size() >= 2) {
                    stack.pop(); // Удаляем последний результат
                    return stack.peek(); // Возвращаем предыдущий результат
                }
                break;
            default:
                System.out.println("Неподдерживаемая операция: " + op);
        }
        return stack.peek();
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer3 {
    public static void main(String[] args) {
        int a, b, c, d;
        char op, op2, undo;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
            c = 4;
            op2 = '+';
            d = 7;
            undo = '<';
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
            c = Integer.parseInt(args[3]);
            op2 = args[4].charAt(0);
            d = Integer.parseInt(args[5]);
            undo = args[6].charAt(0);
        }

        Calculator calculator = new Calculator();
        double result = calculator.calculate(op, a, b);
        System.out.println(result);
        double result2 = calculator.calculate(op2, c, d);
        System.out.println(result2);
        double prevResult = calculator.calculate(undo, 0, 0);
        System.out.println(prevResult);
    }
}

//Решение от ГБ
//import java.util.ArrayDeque;
//import java.util.Deque;
//
//class Calculator {
//    public Deque<Double> resultsStack = new ArrayDeque<>();
//    public double prevResult;
//
//    public double calculate(char op, int a, int b) {
//        if (op == '<') {
//            if (resultsStack.size() >= 2) {
//                resultsStack.pop();
//                prevResult = resultsStack.peek();
//            }
//            return prevResult;
//        } else {
//            double result = performOperation(op, a, b);
//            resultsStack.push(result);
//            prevResult = result;
//            return result;
//        }
//    }
//
//    private double performOperation(char op, int a, int b) {
//        double result = 0;
//        switch (op) {
//            case '+':
//                result = add(a, b);
//                break;
//            case '-':
//                result = minus(a, b);
//                break;
//            case '*':
//                result = mult(a, b);
//                break;
//            case '/':
//                result = divide(a, b);
//                break;
//        }
//        return result;
//    }
//
//    private double divide(int a, int b) {
//        if (b != 0)
//            return (double) a / b;
//        return -1;
//    }
//
//    private int mult(int a, int b) {
//        return a * b;
//    }
//
//    private int minus(int a, int b) {
//        return a - b;
//    }
//
//    private int add(int a, int b) {
//        return a + b;
//    }
//}
//
//public class Printer {
//    public static void main(String[] args) {
//        int a, b, c, d;
//        char op, op2, undo;
//
//        if (args.length == 0) {
//            a = 3;
//            op = '+';
//            b = 7;
//            c = 4;
//            op2 = '+';
//            d = 7;
//            undo = '<';
//        } else {
//            a = Integer.parseInt(args[0]);
//            op = args[1].charAt(0);
//            b = Integer.parseInt(args[2]);
//            c = Integer.parseInt(args[3]);
//            op2 = args[4].charAt(0);
//            d = Integer.parseInt(args[5]);
//            undo = args[6].charAt(0);
//        }
//
//        // Ниже добавить проверку оператора на корректность
//        if (op != '+' && op != '-' && op != '*' && op != '/') {
//            System.out.println("Некорректный оператор: " + op);
//            return;
//        }
//
//        Calculator calculator = new Calculator();
//        double result = calculator.calculate(op, a, b);
//        System.out.println(result);
//        double result2 = calculator.calculate(op2, c, d);
//        System.out.println(result2);
//        double prevResult = calculator.calculate(undo, 0, 0);
//        System.out.println(prevResult);
//    }
//}
