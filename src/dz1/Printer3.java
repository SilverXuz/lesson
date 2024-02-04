package dz1;

/*
* Реализуйте простой калькулятор
* В методе calculate класса Calculator реализовать калькулятор, который будет выполнять математические
* операции (+, -, *, /) над двумя целыми числами и возвращать результат вещественного типа.
* В классе Printer необходимо реализовать проверку переданного оператора, при некорректном операторе программа
* должна вывести сообщение об ошибке "Некорректный оператор: 'оператор'".
* Аргументы, передаваемые в метод/функцию:
*/

class Calculator {
    public float calculate(char op, int a, int b) {
        // Введите свое решение ниже
        float result = 0.0f;

        if (op == '+') {
            result = a + b;
        } else if (op == '-') {
            result = a - b;
        } else if (op == '*') {
            result = a * b;
        } else if (op == '/') {
            if (b == 0){
                System.out.println("На ноль делить нельзя");
            } else {
                result = (float) a / b;
            }
        } else {
            System.out.println("Некорректный оператор: '" + op + "'");
        }
        return result;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer3{
    public static void main(String[] args) {
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '-';
            b = 5;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        Calculator calculator = new Calculator();
        float result = calculator.calculate(op, a, b);
        System.out.println(result);
    }
}


//Второй вариант решения
//class Calculator {
//    public double calculate(char op, int a, int b) {
//        double result = 0.0;
//
//        switch (op) {
//            case '+':
//                result = a + b;
//                break;
//            case '-':
//                result = a - b;
//                break;
//            case '*':
//                result = a * b;
//                break;
//            case '/':
//                if (b != 0) {
//                    result = (double) a / b;
//                } else {
//                    System.out.println("Ошибка: деление на ноль");
//                }
//                break;
//            default:
//                System.out.println("Некорректный оператор: '" + op + "'");
//                break;
//        }
//
//        return result;
//    }
//}


//public class Printer {
//    public static void main(String[] args) {
//        int a = 0;
//        char op = ' ';
//        int b = 0;
//
//        if (args.length == 0) {
//            // При отправке кода на Выполнение, вы можете варьировать эти параметры
//            a = 3;
//            op = '+';
//            b = 7;
//        } else {
//            if (args.length != 3) {
//                System.out.println("Ошибка: Неверное количество аргументов");
//                return;
//            }
//
//            try {
//                a = Integer.parseInt(args[0]);
//                op = args[1].charAt(0);
//                b = Integer.parseInt(args[2]);
//            } catch (NumberFormatException e) {
//                System.out.println("Ошибка: Некорректные аргументы");
//                return;
//            }
//        }
//
//        Calculator calculator = new Calculator();
//        double result = calculator.calculate(op, a, b);
//        System.out.println(result);
//    }
//}
