package part3;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main3 {
    public static void main(String[] args) {
        String message = readInput();
        StringBuilder result = new StringBuilder();

        result = decodeMessage(message);

        System.out.println(result);
    }

    public static StringBuilder decodeMessage(String message) {
        StringBuilder messageBuilder = new StringBuilder();

        // Создаем регулярное выражение, которое будет искать букву
        // и следующее за ней число. Буква и число будут помещены в группы
        Pattern pattern = Pattern.compile("(\\D+)(\\d+)");
        Matcher matcher = pattern.matcher(message);

        // Пока в message есть совпадения с регулярным выражением
        // формируем выходную сроку
        while (matcher.find()) {
            String ch = matcher.group(1);
            int count = Integer.parseInt(matcher.group(2));

            // Используем разделитель запятую с пробелом
            // пока matcher не достиг конца
            String delimiter = ", ";

            // Повторение через запятую символа требуемое количество раз
            for (int i = 0; i < count; i++) {
                messageBuilder.append(ch);

                // после последнего элемента разделитель - пустая строка
                if (matcher.hitEnd() && i == count - 1) {
                    delimiter = "";
                }

                messageBuilder.append(delimiter);
            }
            // на Stepik не работает метод messageBuilder.repeat()
            // поэтому делаем через цикл, иначе было бы просто
            // messageBuilder.repeat(ch + delimiter, count);

        }

        return messageBuilder;
    }

    public static String readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}