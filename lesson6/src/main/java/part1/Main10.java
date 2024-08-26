package part1;

import com.google.gson.Gson;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main10 {
    public static void main(String[] args) {
        List<String> tags = readInput();
        String result;

        result = toString(countTags(tags));

        System.out.println(result);
    }

    // оставляем уникальные элементы и считаем количество их появлений
    public static LinkedHashMap<String, Integer> countTags(List<String> tags) {
        LinkedHashMap<String, Integer> result = new LinkedHashMap<>();
        for (String tag : tags) {
            if (!result.containsKey(tag)) {
                result.put(tag, 1);
            } else {
                result.put(tag, result.get(tag) + 1);
            }
        }
        return result;
    }

    // соединяем ключ и значение через ": ",
    // получившиеся пары через разделитель ", "
    public static String toString(LinkedHashMap<String, Integer> data) {
        return data.entrySet().stream()
                .map(e -> e.getKey() + ": " + e.getValue())
                .collect(Collectors.joining(", "));
    }

    public static List<String> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input;
        if (scanner.hasNextLine()) {
            input = scanner.nextLine();
            Gson gson = new Gson();
            String[] dataArray = gson.fromJson(input, String[].class);
            return Arrays.asList(dataArray);
        }
        scanner.close();
        return null;
    }
}
