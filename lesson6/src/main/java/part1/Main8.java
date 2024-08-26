package part1;

import com.google.gson.Gson;

import java.util.*;
import java.util.stream.Collectors;


public class Main8 {
    public static void main(String[] args) {
        List<Integer> data = readInput();
        String result;

        data = sortUnique(data);

        result = toString(data);

        System.out.println(result);
    }

    // оставляем уникальные элементы и сортируем
    public static List<Integer> sortUnique(List<Integer> data) {
        Set<Integer> set = new TreeSet<>(data);
        List<Integer> result = new ArrayList<>(set);
        Collections.sort(result);
        return result;
    }

    // соединяем элементы коллекции через разделитель ", ", используя стрим
    public static String toString(List<Integer> data) {
        return data.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }


    public static List<Integer> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input;
        if (scanner.hasNextLine()) {
            input = scanner.nextLine();
            Gson gson = new Gson();
            Integer[] dataArray = gson.fromJson(input, Integer[].class);
            return Arrays.asList(dataArray);
        }
        scanner.close();
        return null;
    }
}
