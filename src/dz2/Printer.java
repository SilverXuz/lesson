package dz2;
/*
* Дана строка sql-запроса:
select * from students where "
*
* Сформируйте часть WHERE этого запроса, используя StringBuilder.
* Данные (параметры) для фильтрации приведены в виде json-строки в примере ниже.
* Если значение null, то параметр не должен попадать в запрос.

Напишите свой код в методе answer класса Answer. Метод answer принимает на вход два параметра:

String QUERY - начало SQL-запроса String PARAMS - JSON с параметрами

Пример: Строка sql-запроса:
select * from students where
*
Параметры для фильтрации:
 {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

* Результат:
select * from students where name='Ivanov' and country='Russia' and city='Moscow'
*
* */


class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS){
        // Напишите свое решение ниже
        // Создаем StringBuilder для формирования SQL запроса
        StringBuilder sqlQuery = new StringBuilder(QUERY);

        // Удаляем лишние пробелы в начале и конце строки PARAMS
        PARAMS = PARAMS.trim();

        // Удаляем фигурные скобки
        PARAMS = PARAMS.substring(1, PARAMS.length() - 1);

        // Разделяем строку на отдельные пары ключ-значение
        String[] paramsArray = PARAMS.split(", ");

        // Формируем условия для SQL запроса
        for (String param : paramsArray) {
            // Разделяем пару ключ-значение
            String[] keyValue = param.split(":");
            String key = keyValue[0].replace("\"", "");
            String value = keyValue[1].replace("\"", "");

            // Если ключ - "age" и его значение - "null", то пропускаем его
            if (value.equals("null")) {
                continue;
            }

            // Добавляем условие к запросу
            sqlQuery.append(key).append("='").append(value).append("' and ");
        }

        // Удаляем последний "and " из запроса
        if (sqlQuery.length() > QUERY.length()) {
            sqlQuery.delete(sqlQuery.length() - 5, sqlQuery.length());
        }

        // Возвращаем сформированный SQL запрос
        return sqlQuery;
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
        String QUERY = "";
        String PARAMS = "";

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            QUERY = "select * from students where ";
            PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        }
        else{
            QUERY = args[0];
            PARAMS = args[1];
        }

//        Answer ans = new Answer();
        System.out.println(Answer.answer(QUERY, PARAMS));
    }
}
