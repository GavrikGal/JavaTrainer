package part2;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.*;
import java.util.stream.Collectors;


public class Main1 {
    public static void main(String[] args) {
        List<Integer> data = readInput();
        String result;

        result = findEvenOddNumbers(data);

        System.out.println(result);
    }

    public static String findEvenOddNumbers(List<Integer> data) {
        List<Integer> evenNumbers;
        List<Integer> oddNumbers;

        // Для начала отсортируем числа, а потом соберем четные и нечетные числа в мапу
        Map<Boolean, List<Integer>> partitions = data.stream()
                .sorted()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        // Для наглядности сложим четные и нечетные числа в соответствующие листы
        evenNumbers = partitions.get(true);
        oddNumbers = partitions.get(false);

        // Преобразуем листы в отформатированные строки и вернем результат
        return listToString(evenNumbers) + " " + listToString(oddNumbers);
    }

    public static String listToString(List<Integer> list) {
        return list.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", ", "(", ")"));
    }

    public static List<Integer> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Gson gson = new Gson();
        Type listType = new TypeToken<List<Integer>>(){}.getType();
        return gson.fromJson(input, listType);
    }
}