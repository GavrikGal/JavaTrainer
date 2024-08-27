package part2;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;


public class Main3 {
    public static void main(String[] args) {
        List<List<Integer>> data = readInput();
        int result;

        result = findMaxNumber(data);

        System.out.println(result);
    }

    public static int findMaxNumber(List<List<Integer>> data) {
        return data.stream()
                // "Разворачиваем" Stream<List<String>> в Stream<String>
                .flatMap(Collection::stream)
                .mapToInt(Integer::intValue)
                .max().orElse(0);
    }

    public static List<List<Integer>> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Gson gson = new Gson();
        Type listType = new TypeToken<List<List<Integer>>>(){}.getType();
        return gson.fromJson(input, listType);
    }
}