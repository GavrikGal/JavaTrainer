package part1;

import com.google.gson.Gson;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main7 {
    public static void main(String[] args) {
        List<Integer> data = readInput();
        String result;

        data = sort(data);

        result = toString(data);

        System.out.println(result);
    }

    // сортируем элементы коллекции
    public static List<Integer> sort(List<Integer> data) {
        Collections.sort(data);
        return data;
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
