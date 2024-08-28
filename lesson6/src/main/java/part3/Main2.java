package part3;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Main2 {
    public static void main(String[] args) {
        List<String> data = readInput();
        StringBuilder result = new StringBuilder();

        result = countRepetitions(data);


        System.out.println(result);
    }


    // Stream
    public static StringBuilder countRepetitions(List<String> data) {
        return new StringBuilder(
                // Будем проводить поиск по всем элементам списка
                IntStream.range(0, data.size())
                        // Проверяем, является ли элемент первым
                        // или отличаетмя от предыдущего,
                        // чтобы начать новую группу
                        .filter(i -> i == 0 || !data.get(i).equals(data.get(i-1)))
                        // Формируем строку, где учитываем количество повторений
                        // текущего элемента с использованием takeWhile
                        .mapToObj(i -> {
                            long count = IntStream.range(i, data.size())
                                    .takeWhile(j -> data.get(j).equals(data.get(i)))
                                    .count();
                            return data.get(i) + count;
                        })
                        // Объединяем всё в одну строку
                        .collect(Collectors.joining())
        );
    }


    public static List<String> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return new Gson().fromJson(input, new TypeToken<List<String>>() {}.getType());
    }
}