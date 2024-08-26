package part1;

import com.google.gson.Gson;

import java.util.*;


public class Main9 {
    public static void main(String[] args) {
        List<String> tags = readInput();
        String result;

        tags = sortUnique(tags);

        result = toString(tags);

        System.out.println(result);
    }

    // оставляем уникальные элементы и сортируем
    public static List<String> sortUnique(List<String> data) {
        Set<String> set = new TreeSet<>(data);
        List<String> result = new ArrayList<>(set);
        Collections.sort(result);
        return result;
    }

    // соединяем элементы коллекции через разделитель ", "
    public static String toString(List<String> data) {
        return String.join(", ", data);
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
